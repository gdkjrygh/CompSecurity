.class public Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;
.super Lcom/facebook/c/r;
.source "MessengerLoggedInUserProvider.java"


# static fields
.field public static final a:Ljava/lang/Integer;

.field public static final b:Ljava/lang/Integer;


# instance fields
.field private c:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 28
    new-instance v0, Ljava/lang/Integer;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    sput-object v0, Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;->a:Ljava/lang/Integer;

    .line 29
    new-instance v0, Ljava/lang/Integer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    sput-object v0, Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;->b:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/facebook/c/r;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 114
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "update should not be called on this content provider"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected a(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 108
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "delete should not be called on this content provider"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected a(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 10

    .prologue
    const/4 v9, 0x3

    const/4 v8, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 60
    new-instance v6, Landroid/database/MatrixCursor;

    new-array v0, v9, [Ljava/lang/String;

    const-string v1, "li"

    aput-object v1, v0, v3

    const-string v1, "push_receiver"

    aput-object v1, v0, v2

    const-string v1, "oli"

    aput-object v1, v0, v8

    invoke-direct {v6, v0}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;)V

    .line 63
    invoke-virtual {p0}, Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 65
    invoke-virtual {p0}, Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 67
    const-class v1, Ljava/lang/String;

    const-class v4, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {v0, v1, v4}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    .line 69
    const-class v4, Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0, v4}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/c2dm/y;

    .line 75
    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 78
    :try_start_0
    iget-object v4, p0, Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;->c:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v4, p3}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    .line 79
    const-string v5, "userId"

    invoke-virtual {v4, v5}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-virtual {v4}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object v7

    .line 81
    if-eqz v7, :cond_5

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    if-eqz v4, :cond_5

    move v5, v2

    .line 84
    :goto_0
    if-eqz v7, :cond_4

    :try_start_1
    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    if-eqz v0, :cond_4

    move v4, v2

    .line 87
    :goto_1
    if-eqz v1, :cond_3

    :try_start_2
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    move-result v0

    if-nez v0, :cond_3

    move v0, v2

    :goto_2
    move v1, v4

    move v4, v5

    .line 93
    :goto_3
    new-array v5, v9, [Ljava/lang/Object;

    if-eqz v4, :cond_0

    sget-object v4, Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;->a:Ljava/lang/Integer;

    :goto_4
    aput-object v4, v5, v3

    if-eqz v1, :cond_1

    sget-object v1, Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;->a:Ljava/lang/Integer;

    :goto_5
    aput-object v1, v5, v2

    if-eqz v0, :cond_2

    sget-object v0, Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;->a:Ljava/lang/Integer;

    :goto_6
    aput-object v0, v5, v8

    invoke-virtual {v6, v5}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    .line 98
    return-object v6

    .line 90
    :catch_0
    move-exception v0

    move v0, v3

    move v1, v3

    :goto_7
    move v4, v1

    move v1, v0

    move v0, v3

    goto :goto_3

    .line 93
    :cond_0
    sget-object v4, Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;->b:Ljava/lang/Integer;

    goto :goto_4

    :cond_1
    sget-object v1, Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;->b:Ljava/lang/Integer;

    goto :goto_5

    :cond_2
    sget-object v0, Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;->b:Ljava/lang/Integer;

    goto :goto_6

    .line 90
    :catch_1
    move-exception v0

    move v0, v3

    move v1, v5

    goto :goto_7

    :catch_2
    move-exception v0

    move v0, v4

    move v1, v5

    goto :goto_7

    :cond_3
    move v0, v3

    goto :goto_2

    :cond_4
    move v4, v3

    goto :goto_1

    :cond_5
    move v5, v3

    goto :goto_0
.end method

.method protected a(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 2

    .prologue
    .line 103
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "insert should not be called on this content provider"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected a(Landroid/net/Uri;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "vnd.android.cursor.dir/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected a()V
    .locals 2

    .prologue
    .line 119
    invoke-virtual {p0}, Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 120
    const-class v1, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    iput-object v0, p0, Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;->c:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 121
    return-void
.end method

.method b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    const-string v0, "content://com.facebook.orca.notify.MessengerLoggedInUserProvider/logged_in_user"

    return-object v0
.end method
