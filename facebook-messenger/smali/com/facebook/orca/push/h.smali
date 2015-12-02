.class public Lcom/facebook/orca/push/h;
.super Ljava/lang/Object;
.source "MessengerUserUtils.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/ContentResolver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const-class v0, Lcom/facebook/orca/push/h;

    sput-object v0, Lcom/facebook/orca/push/h;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/ContentResolver;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/facebook/orca/push/h;->b:Landroid/content/ContentResolver;

    .line 56
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/facebook/orca/push/i;
    .locals 10

    .prologue
    const/4 v9, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 69
    sget-object v0, Lcom/facebook/orca/push/h;->a:Ljava/lang/Class;

    const-string v1, "Checking Messenger to see if user %s is the push notification receiver"

    new-array v2, v6, [Ljava/lang/Object;

    aput-object p1, v2, v7

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    sget-object v8, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    .line 77
    :try_start_0
    new-instance v3, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v3, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 78
    const-string v0, "userId"

    invoke-virtual {v3, v0, p1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 79
    iget-object v0, p0, Lcom/facebook/orca/push/h;->b:Landroid/content/ContentResolver;

    const-string v1, "content://com.facebook.orca.notify.MessengerLoggedInUserProvider/logged_in_user"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v4

    .line 86
    if-eqz v4, :cond_7

    move-object v1, v8

    move v0, v7

    move v2, v7

    .line 88
    :goto_0
    :try_start_1
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 89
    const/4 v2, 0x0

    invoke-interface {v4, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    sget-object v3, Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;->b:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v3

    if-le v2, v3, :cond_1

    move v2, v6

    .line 90
    :goto_1
    if-eqz v2, :cond_2

    move v0, v6

    .line 109
    :cond_0
    :try_start_2
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    move v3, v2

    move v2, v0

    .line 112
    :goto_2
    new-instance v0, Lcom/facebook/orca/push/i;

    invoke-direct {v0, v3, v2, v1}, Lcom/facebook/orca/push/i;-><init>(ZZLcom/facebook/common/w/q;)V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 122
    :goto_3
    return-object v0

    :cond_1
    move v2, v7

    .line 89
    goto :goto_1

    .line 96
    :cond_2
    :try_start_3
    invoke-interface {v4}, Landroid/database/Cursor;->getColumnCount()I

    move-result v3

    if-lt v3, v9, :cond_6

    .line 97
    const/4 v0, 0x1

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    sget-object v3, Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;->b:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-le v0, v3, :cond_3

    move v0, v6

    :goto_4
    move v3, v0

    .line 102
    :goto_5
    invoke-interface {v4}, Landroid/database/Cursor;->getColumnCount()I

    move-result v0

    const/4 v5, 0x3

    if-lt v0, v5, :cond_5

    .line 103
    const/4 v0, 0x2

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    sget-object v1, Lcom/facebook/orca/notify/MessengerLoggedInUserProvider;->b:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-le v0, v1, :cond_4

    sget-object v0, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    :goto_6
    move-object v1, v0

    move v0, v3

    goto :goto_0

    :cond_3
    move v0, v7

    .line 97
    goto :goto_4

    .line 103
    :cond_4
    sget-object v0, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_6

    .line 109
    :catchall_0
    move-exception v0

    :try_start_4
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    throw v0
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 113
    :catch_0
    move-exception v0

    .line 116
    sget-object v1, Lcom/facebook/orca/push/h;->a:Ljava/lang/Class;

    const-string v2, "Caught exception checking orca pref"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    new-instance v0, Lcom/facebook/orca/push/i;

    sget-object v1, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    invoke-direct {v0, v7, v7, v1}, Lcom/facebook/orca/push/i;-><init>(ZZLcom/facebook/common/w/q;)V

    goto :goto_3

    .line 118
    :catch_1
    move-exception v0

    .line 120
    const-string v1, "MESSENGER_LOGGED_IN_USER_PROVIDER"

    const-string v2, "Exception in MessengerLoggedInUserProvider"

    invoke-static {v1, v2, v0}, Lcom/facebook/common/e/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 122
    new-instance v0, Lcom/facebook/orca/push/i;

    sget-object v1, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    invoke-direct {v0, v7, v7, v1}, Lcom/facebook/orca/push/i;-><init>(ZZLcom/facebook/common/w/q;)V

    goto :goto_3

    :cond_5
    move v0, v3

    goto :goto_0

    :cond_6
    move v3, v0

    goto :goto_5

    :cond_7
    move-object v1, v8

    move v2, v7

    move v3, v7

    goto :goto_2
.end method
