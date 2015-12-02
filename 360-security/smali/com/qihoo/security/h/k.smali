.class public final Lcom/qihoo/security/h/k;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static c:Lcom/qihoo/security/h/k;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/qihoo/security/h/j;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/h/k;->d:Ljava/util/HashSet;

    .line 104
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/h/k;->a:Landroid/content/Context;

    .line 108
    invoke-direct {p0}, Lcom/qihoo/security/h/k;->d()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/h/k;->b:Ljava/util/Map;

    .line 110
    invoke-direct {p0}, Lcom/qihoo/security/h/k;->c()V

    .line 112
    return-void
.end method

.method public static a()Lcom/qihoo/security/h/k;
    .locals 3

    .prologue
    .line 129
    const-class v1, Lcom/qihoo/security/h/k;

    monitor-enter v1

    .line 130
    :try_start_0
    sget-object v0, Lcom/qihoo/security/h/k;->c:Lcom/qihoo/security/h/k;

    if-nez v0, :cond_0

    .line 131
    new-instance v0, Lcom/qihoo/security/h/k;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/qihoo/security/h/k;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/security/h/k;->c:Lcom/qihoo/security/h/k;

    .line 133
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    sget-object v0, Lcom/qihoo/security/h/k;->c:Lcom/qihoo/security/h/k;

    return-object v0

    .line 133
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static b(I)V
    .locals 0

    .prologue
    .line 231
    return-void
.end method

.method private c()V
    .locals 3

    .prologue
    .line 117
    iget-object v0, p0, Lcom/qihoo/security/h/k;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 118
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 119
    iget-object v2, p0, Lcom/qihoo/security/h/k;->d:Ljava/util/HashSet;

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 122
    :cond_0
    return-void
.end method

.method private d()Ljava/util/HashMap;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/qihoo/security/h/j;",
            ">;"
        }
    .end annotation

    .prologue
    const/16 v7, 0xa

    const/16 v6, 0x8

    const/4 v5, 0x6

    const/4 v4, 0x5

    .line 140
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 142
    new-instance v1, Lcom/qihoo/security/h/j;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/qihoo/security/h/k;->a:Landroid/content/Context;

    invoke-direct {v1, v2, v3}, Lcom/qihoo/security/h/j;-><init>(ILandroid/content/Context;)V

    .line 143
    const-string/jumbo v2, "android.permission.READ_SMS"

    invoke-virtual {v1, v2}, Lcom/qihoo/security/h/j;->a(Ljava/lang/String;)V

    .line 144
    const-string/jumbo v2, "android.permission.WRITE_SMS"

    invoke-virtual {v1, v2}, Lcom/qihoo/security/h/j;->a(Ljava/lang/String;)V

    .line 145
    iget v2, v1, Lcom/qihoo/security/h/j;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    new-instance v1, Lcom/qihoo/security/h/j;

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/qihoo/security/h/k;->a:Landroid/content/Context;

    invoke-direct {v1, v2, v3}, Lcom/qihoo/security/h/j;-><init>(ILandroid/content/Context;)V

    .line 149
    const-string/jumbo v2, "android.permission.READ_CONTACTS"

    invoke-virtual {v1, v2}, Lcom/qihoo/security/h/j;->a(Ljava/lang/String;)V

    .line 150
    const-string/jumbo v2, "android.permission.WRITE_CONTACTS"

    invoke-virtual {v1, v2}, Lcom/qihoo/security/h/j;->a(Ljava/lang/String;)V

    .line 151
    iget v2, v1, Lcom/qihoo/security/h/j;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    new-instance v1, Lcom/qihoo/security/h/j;

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/qihoo/security/h/k;->a:Landroid/content/Context;

    invoke-direct {v1, v2, v3}, Lcom/qihoo/security/h/j;-><init>(ILandroid/content/Context;)V

    .line 155
    const-string/jumbo v2, "android.permission.READ_CONTACTS"

    invoke-virtual {v1, v2}, Lcom/qihoo/security/h/j;->a(Ljava/lang/String;)V

    .line 156
    const-string/jumbo v2, "android.permission.WRITE_CONTACTS"

    invoke-virtual {v1, v2}, Lcom/qihoo/security/h/j;->a(Ljava/lang/String;)V

    .line 157
    iget v2, v1, Lcom/qihoo/security/h/j;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    new-instance v1, Lcom/qihoo/security/h/j;

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/qihoo/security/h/k;->a:Landroid/content/Context;

    invoke-direct {v1, v2, v3}, Lcom/qihoo/security/h/j;-><init>(ILandroid/content/Context;)V

    .line 171
    const-string/jumbo v2, "android.permission.SEND_SMS"

    invoke-virtual {v1, v2}, Lcom/qihoo/security/h/j;->a(Ljava/lang/String;)V

    .line 172
    iget v2, v1, Lcom/qihoo/security/h/j;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    new-instance v1, Lcom/qihoo/security/h/j;

    iget-object v2, p0, Lcom/qihoo/security/h/k;->a:Landroid/content/Context;

    invoke-direct {v1, v4, v2}, Lcom/qihoo/security/h/j;-><init>(ILandroid/content/Context;)V

    .line 176
    const-string/jumbo v2, "android.permission.ACCESS_FINE_LOCATION"

    invoke-virtual {v1, v2}, Lcom/qihoo/security/h/j;->a(Ljava/lang/String;)V

    .line 177
    const-string/jumbo v2, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {v1, v2}, Lcom/qihoo/security/h/j;->a(Ljava/lang/String;)V

    .line 178
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    new-instance v1, Lcom/qihoo/security/h/j;

    iget-object v2, p0, Lcom/qihoo/security/h/k;->a:Landroid/content/Context;

    invoke-direct {v1, v5, v2}, Lcom/qihoo/security/h/j;-><init>(ILandroid/content/Context;)V

    .line 182
    const-string/jumbo v2, "android.permission.READ_PHONE_STATE"

    invoke-virtual {v1, v2}, Lcom/qihoo/security/h/j;->a(Ljava/lang/String;)V

    .line 183
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    new-instance v1, Lcom/qihoo/security/h/g;

    iget-object v2, p0, Lcom/qihoo/security/h/k;->a:Landroid/content/Context;

    invoke-direct {v1, v6, v2}, Lcom/qihoo/security/h/g;-><init>(ILandroid/content/Context;)V

    .line 187
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    new-instance v1, Lcom/qihoo/security/h/j;

    iget-object v2, p0, Lcom/qihoo/security/h/k;->a:Landroid/content/Context;

    invoke-direct {v1, v7, v2}, Lcom/qihoo/security/h/j;-><init>(ILandroid/content/Context;)V

    .line 201
    const-string/jumbo v2, "android.permission.CALL_PHONE"

    invoke-virtual {v1, v2}, Lcom/qihoo/security/h/j;->a(Ljava/lang/String;)V

    .line 202
    const-string/jumbo v2, "android.permission.CALL_PRIVILEGED"

    invoke-virtual {v1, v2}, Lcom/qihoo/security/h/j;->a(Ljava/lang/String;)V

    .line 203
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    return-object v0
.end method


# virtual methods
.method public a(I)Z
    .locals 2

    .prologue
    .line 125
    iget-object v0, p0, Lcom/qihoo/security/h/k;->d:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/qihoo/security/h/j;",
            ">;"
        }
    .end annotation

    .prologue
    .line 217
    iget-object v0, p0, Lcom/qihoo/security/h/k;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
