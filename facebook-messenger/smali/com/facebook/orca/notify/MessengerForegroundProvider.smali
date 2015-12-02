.class public Lcom/facebook/orca/notify/MessengerForegroundProvider;
.super Lcom/facebook/c/r;
.source "MessengerForegroundProvider.java"


# static fields
.field public static final a:Ljava/lang/Integer;

.field public static final b:Ljava/lang/Integer;

.field private static final e:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private c:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/notify/MessengerForegroundProvider;->a:Ljava/lang/Integer;

    .line 27
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/notify/MessengerForegroundProvider;->b:Ljava/lang/Integer;

    .line 34
    const-class v0, Lcom/facebook/orca/notify/MessengerForegroundProvider;

    sput-object v0, Lcom/facebook/orca/notify/MessengerForegroundProvider;->e:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/facebook/c/r;-><init>()V

    return-void
.end method

.method private b()Ljava/lang/String;
    .locals 3

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/orca/notify/MessengerForegroundProvider;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 51
    invoke-virtual {p0}, Lcom/facebook/orca/notify/MessengerForegroundProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 52
    const-class v1, Ljava/lang/String;

    const-class v2, Lcom/facebook/orca/annotations/MessagesForegroundProviderAuthority;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/orca/notify/MessengerForegroundProvider;->d:Ljava/lang/String;

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/notify/MessengerForegroundProvider;->d:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method protected a(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 126
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "update should not be called on this content provider"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected a(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 120
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "delete should not be called on this content provider"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected a(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 12

    .prologue
    .line 67
    new-instance v5, Landroid/database/MatrixCursor;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "fg"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "displays_inapp_notif"

    aput-object v2, v0, v1

    invoke-direct {v5, v0}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;)V

    .line 69
    invoke-virtual {p0}, Lcom/facebook/orca/notify/MessengerForegroundProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v3

    .line 70
    const-class v0, Lcom/facebook/orca/threadview/do;

    invoke-virtual {v3, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/do;

    .line 71
    const-class v1, Lcom/facebook/orca/notify/j;

    invoke-virtual {v3, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/notify/j;

    .line 73
    const-class v2, Lcom/facebook/orca/notify/at;

    invoke-virtual {v3, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/notify/at;

    .line 75
    const-class v4, Ljava/lang/String;

    const-class v6, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {v3, v4, v6}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 77
    sget-object v6, Lcom/facebook/orca/notify/MessengerForegroundProvider;->b:Ljava/lang/Integer;

    .line 78
    sget-object v4, Lcom/facebook/orca/notify/MessengerForegroundProvider;->b:Ljava/lang/Integer;

    .line 80
    :try_start_0
    iget-object v7, p0, Lcom/facebook/orca/notify/MessengerForegroundProvider;->c:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v7, p3}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v7

    .line 81
    const-string v8, "userId"

    invoke-virtual {v7, v8}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v8

    invoke-virtual {v8}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object v8

    .line 82
    const-string v9, "threadId"

    invoke-virtual {v7, v9}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v7

    invoke-virtual {v7}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object v7

    .line 84
    sget-object v9, Lcom/facebook/orca/notify/MessengerForegroundProvider;->e:Ljava/lang/Class;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Querying notification state for user: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " thread: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 86
    invoke-virtual {v2}, Lcom/facebook/orca/notify/at;->a()Landroid/app/Activity;

    move-result-object v2

    .line 87
    if-eqz v7, :cond_0

    if-eqz v8, :cond_0

    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    if-nez v2, :cond_1

    .line 91
    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/orca/notify/MessengerForegroundProvider;->b:Ljava/lang/Integer;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/facebook/orca/notify/MessengerForegroundProvider;->b:Ljava/lang/Integer;

    aput-object v2, v0, v1

    invoke-virtual {v5, v0}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    move-object v0, v5

    .line 110
    :goto_0
    return-object v0

    .line 95
    :cond_1
    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadview/do;->a(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    .line 96
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 97
    sget-object v2, Lcom/facebook/orca/notify/MessengerForegroundProvider;->a:Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    :goto_1
    :try_start_1
    invoke-virtual {v1, v7}, Lcom/facebook/orca/notify/j;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 101
    sget-object v0, Lcom/facebook/orca/notify/MessengerForegroundProvider;->a:Ljava/lang/Integer;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    move-object v1, v2

    .line 107
    :goto_3
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    invoke-virtual {v5, v2}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    .line 108
    sget-object v2, Lcom/facebook/orca/notify/MessengerForegroundProvider;->e:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "replying with thread in Foreground = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ", displays in app notification = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    move-object v0, v5

    .line 110
    goto :goto_0

    .line 104
    :catch_0
    move-exception v0

    move-object v0, v6

    :goto_4
    move-object v1, v0

    move-object v0, v4

    goto :goto_3

    :catch_1
    move-exception v0

    move-object v0, v2

    goto :goto_4

    :cond_2
    move-object v0, v4

    goto :goto_2

    :cond_3
    move-object v2, v6

    goto :goto_1
.end method

.method protected a(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 2

    .prologue
    .line 115
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "insert should not be called on this content provider"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected a(Landroid/net/Uri;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "vnd.android.cursor.dir/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lcom/facebook/orca/notify/MessengerForegroundProvider;->b()Ljava/lang/String;

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
    .line 38
    invoke-virtual {p0}, Lcom/facebook/orca/notify/MessengerForegroundProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 40
    invoke-virtual {p0}, Lcom/facebook/orca/notify/MessengerForegroundProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 41
    const-class v1, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    iput-object v0, p0, Lcom/facebook/orca/notify/MessengerForegroundProvider;->c:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 42
    return-void
.end method
