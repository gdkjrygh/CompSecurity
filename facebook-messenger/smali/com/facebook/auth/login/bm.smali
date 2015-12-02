.class public Lcom/facebook/auth/login/bm;
.super Ljava/lang/Object;
.source "SsoLoginUtil.java"


# instance fields
.field private final a:Landroid/content/ContentResolver;

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/config/a/b;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method public constructor <init>(Ljavax/inject/a;Ljavax/inject/a;Lcom/fasterxml/jackson/databind/ObjectMapper;Landroid/content/ContentResolver;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/config/a/b;",
            ">;",
            "Lcom/fasterxml/jackson/databind/ObjectMapper;",
            "Landroid/content/ContentResolver;",
            ")V"
        }
    .end annotation

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/facebook/auth/login/bm;->b:Ljavax/inject/a;

    .line 44
    iput-object p2, p0, Lcom/facebook/auth/login/bm;->c:Ljavax/inject/a;

    .line 45
    iput-object p3, p0, Lcom/facebook/auth/login/bm;->d:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 46
    iput-object p4, p0, Lcom/facebook/auth/login/bm;->a:Landroid/content/ContentResolver;

    .line 47
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 11

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 96
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v2, p2, v0}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v2

    .line 98
    if-nez v2, :cond_0

    .line 128
    :goto_0
    return v0

    .line 102
    :cond_0
    iget-object v2, v2, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v2, v2, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 103
    invoke-direct {p0, p1, v2}, Lcom/facebook/auth/login/bm;->a(Landroid/content/Context;Ljava/lang/String;)[Landroid/content/pm/Signature;

    move-result-object v4

    .line 104
    if-nez v4, :cond_1

    .line 105
    const-string v1, "SSO"

    const-string v2, "No signatures found for fb4a, or error occurred while retrieving them"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 108
    :cond_1
    const-string v2, "SSO"

    const-string v3, "%d signatures found for fb4a"

    new-array v5, v1, [Ljava/lang/Object;

    array-length v6, v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v0

    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, v2}, Lcom/facebook/auth/login/bm;->a(Landroid/content/Context;Ljava/lang/String;)[Landroid/content/pm/Signature;

    move-result-object v5

    .line 111
    if-nez v5, :cond_2

    .line 112
    const-string v1, "SSO"

    const-string v2, "No signatures found for orca, or error occurred while retrieving them"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 115
    :cond_2
    const-string v2, "SSO"

    const-string v3, "%d signatures found for orca"

    new-array v6, v1, [Ljava/lang/Object;

    array-length v7, v5

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v0

    invoke-static {v3, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    array-length v6, v4

    move v3, v0

    :goto_1
    if-ge v3, v6, :cond_5

    aget-object v7, v4, v3

    .line 119
    array-length v8, v5

    move v2, v0

    :goto_2
    if-ge v2, v8, :cond_4

    aget-object v9, v5, v2

    .line 120
    invoke-virtual {v7}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v10, v9}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 121
    const-string v0, "SSO"

    const-string v2, "fb4a and orca signatures match!"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v1

    .line 122
    goto :goto_0

    .line 119
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 118
    :cond_4
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_1

    .line 127
    :cond_5
    const-string v1, "SSO"

    const-string v2, "No matching signatures found!"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;)[Landroid/content/pm/Signature;
    .locals 2

    .prologue
    .line 134
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v1, 0x40

    invoke-virtual {v0, p2, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 136
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    :goto_0
    return-object v0

    .line 137
    :catch_0
    move-exception v0

    .line 138
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b()Landroid/content/Intent;
    .locals 3

    .prologue
    .line 54
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 55
    iget-object v1, p0, Lcom/facebook/auth/login/bm;->c:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/facebook/config/a/b;->PUBLIC:Lcom/facebook/config/a/b;

    if-eq v1, v2, :cond_0

    .line 56
    const-string v1, "com.facebook.wakizashi"

    const-string v2, "com.facebook.katana.ProxyAuth"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 60
    :goto_0
    return-object v0

    .line 58
    :cond_0
    const-string v1, "com.facebook.katana"

    const-string v2, "com.facebook.katana.ProxyAuth"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/facebook/auth/credentials/b;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 146
    :try_start_0
    iget-object v0, p0, Lcom/facebook/auth/login/bm;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/a/b;->PUBLIC:Lcom/facebook/config/a/b;

    if-eq v0, v1, :cond_0

    .line 147
    const-string v0, "SSO"

    const-string v1, "Using wakizashi content provider URI"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    const-string v0, "content://com.facebook.wakizashi.provider.UserValuesProvider/user_values"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 154
    :goto_0
    iget-object v0, p0, Lcom/facebook/auth/login/bm;->a:Landroid/content/ContentResolver;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "name"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-string v4, "value"

    aput-object v4, v2, v3

    const-string v3, "name=\'active_session_info\'"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 159
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 160
    const/4 v0, 0x1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 161
    const-string v2, "SSO"

    const-string v3, "fb4a session data obtained"

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 166
    :goto_1
    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 169
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 170
    const-string v0, "SSO"

    const-string v1, "fb4a session information is empty!"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v6

    .line 191
    :goto_2
    return-object v0

    .line 150
    :cond_0
    const-string v0, "SSO"

    const-string v1, "Using katana content provider URI"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    const-string v0, "content://com.facebook.katana.provider.UserValuesProvider/user_values"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v1

    goto :goto_0

    .line 163
    :cond_1
    :try_start_3
    const-string v0, "SSO"

    const-string v2, "fb4a content provider has no session entry."

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v0, v6

    goto :goto_1

    .line 166
    :catchall_0
    move-exception v0

    :try_start_4
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0

    .line 188
    :catch_0
    move-exception v0

    .line 190
    const-string v1, "SSO"

    const-string v2, "Exception occurred while resolving fb4a session."

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v6

    .line 191
    goto :goto_2

    .line 176
    :cond_2
    :try_start_5
    iget-object v1, p0, Lcom/facebook/auth/login/bm;->d:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 177
    const-string v1, "profile"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 178
    const-string v2, "uid"

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    .line 179
    const-string v3, "name"

    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 180
    const-string v3, "access_token"

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    .line 182
    if-eqz v2, :cond_3

    if-eqz v1, :cond_3

    if-nez v3, :cond_4

    .line 183
    :cond_3
    const-string v0, "SSO"

    const-string v1, "fb4a session information is malformed"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v6

    .line 184
    goto :goto_2

    .line 187
    :cond_4
    new-instance v0, Lcom/facebook/auth/credentials/b;

    invoke-direct {v0, v2, v1, v3}, Lcom/facebook/auth/credentials/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_2
.end method

.method public a(Landroid/content/Context;)Z
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/auth/login/bm;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/facebook/auth/login/bm;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Landroid/content/Context;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 64
    invoke-direct {p0}, Lcom/facebook/auth/login/bm;->b()Landroid/content/Intent;

    move-result-object v1

    .line 69
    invoke-direct {p0, p1, v1}, Lcom/facebook/auth/login/bm;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 70
    const-string v1, "SSO"

    const-string v2, "fb4a application package has no matching signatures"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    :cond_0
    :goto_0
    return v0

    .line 74
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/auth/login/bm;->a()Lcom/facebook/auth/credentials/b;

    move-result-object v1

    .line 76
    if-nez v1, :cond_2

    .line 77
    const-string v2, "SSO"

    const-string v3, "User is not logged into FB4A, or there was an error retrieving the session."

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    :cond_2
    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public c(Landroid/content/Context;)Z
    .locals 1

    .prologue
    .line 84
    invoke-direct {p0}, Lcom/facebook/auth/login/bm;->b()Landroid/content/Intent;

    move-result-object v0

    .line 85
    invoke-direct {p0, p1, v0}, Lcom/facebook/auth/login/bm;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v0

    return v0
.end method
