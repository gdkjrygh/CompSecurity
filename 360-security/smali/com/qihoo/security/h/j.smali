.class public Lcom/qihoo/security/h/j;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final f:Ljava/lang/String;


# instance fields
.field public final a:I

.field protected final b:Landroid/content/Context;

.field protected final c:Landroid/content/pm/PackageManager;

.field public d:I

.field protected final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/qihoo/security/h/j;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/h/j;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILandroid/content/Context;)V
    .locals 1

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo/security/h/j;->d:I

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/h/j;->e:Ljava/util/ArrayList;

    .line 38
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/h/j;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 54
    iput p1, p0, Lcom/qihoo/security/h/j;->a:I

    .line 55
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/h/j;->b:Landroid/content/Context;

    .line 56
    iget-object v0, p0, Lcom/qihoo/security/h/j;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/h/j;->c:Landroid/content/pm/PackageManager;

    .line 57
    return-void
.end method

.method private b(ILcom/qihoo/security/h/e;)Z
    .locals 3

    .prologue
    .line 272
    iget-object v1, p2, Lcom/qihoo/security/h/e;->a:Ljava/lang/String;

    .line 274
    iget-object v0, p0, Lcom/qihoo/security/h/j;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 275
    if-eqz v0, :cond_0

    .line 276
    monitor-enter p0

    .line 277
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    monitor-exit p0

    .line 280
    :goto_0
    return v0

    .line 278
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 280
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected a(ILcom/qihoo/security/h/e;)V
    .locals 3

    .prologue
    .line 246
    const/16 v0, 0x3e8

    if-eq p1, v0, :cond_0

    const/16 v0, 0x3e9

    if-ne p1, v0, :cond_1

    .line 263
    :cond_0
    :goto_0
    return-void

    .line 250
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/h/j;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 252
    if-nez v0, :cond_2

    .line 254
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 255
    iget-object v1, p0, Lcom/qihoo/security/h/j;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 257
    :cond_2
    monitor-enter p0

    .line 258
    :try_start_0
    iget-object v1, p2, Lcom/qihoo/security/h/e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 259
    iget-object v1, p2, Lcom/qihoo/security/h/e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    :cond_3
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected final a(Lcom/qihoo/security/h/e;ILandroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 67
    if-nez p1, :cond_0

    .line 80
    :goto_0
    return-void

    .line 69
    :cond_0
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 74
    :pswitch_0
    invoke-virtual {p0, p1, p3}, Lcom/qihoo/security/h/j;->b(Lcom/qihoo/security/h/e;Landroid/os/Bundle;)V

    goto :goto_0

    .line 71
    :pswitch_1
    invoke-virtual {p0, p1, p3}, Lcom/qihoo/security/h/j;->a(Lcom/qihoo/security/h/e;Landroid/os/Bundle;)V

    goto :goto_0

    .line 77
    :pswitch_2
    invoke-virtual {p0, p1, p3}, Lcom/qihoo/security/h/j;->c(Lcom/qihoo/security/h/e;Landroid/os/Bundle;)V

    goto :goto_0

    .line 69
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected a(Lcom/qihoo/security/h/e;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 83
    invoke-virtual {p1}, Lcom/qihoo/security/h/e;->c()I

    move-result v0

    .line 84
    iget-object v1, p1, Lcom/qihoo/security/h/e;->a:Ljava/lang/String;

    .line 85
    invoke-virtual {p0, v1}, Lcom/qihoo/security/h/j;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 86
    iget v1, p0, Lcom/qihoo/security/h/j;->a:I

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Lcom/qihoo/security/h/e;->a(IZ)Z

    .line 87
    invoke-virtual {p0, v0, p1}, Lcom/qihoo/security/h/j;->a(ILcom/qihoo/security/h/e;)V

    .line 96
    :cond_0
    :goto_0
    return-void

    .line 88
    :cond_1
    iget v1, p0, Lcom/qihoo/security/h/j;->a:I

    invoke-virtual {p1, v1}, Lcom/qihoo/security/h/e;->a(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 89
    invoke-virtual {p0}, Lcom/qihoo/security/h/j;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 90
    invoke-direct {p0, v0, p1}, Lcom/qihoo/security/h/j;->b(ILcom/qihoo/security/h/e;)Z

    .line 91
    iget v0, p0, Lcom/qihoo/security/h/j;->a:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/qihoo/security/h/e;->a(IZ)Z

    goto :goto_0

    .line 93
    :cond_2
    invoke-virtual {p0, v0, p1}, Lcom/qihoo/security/h/j;->a(ILcom/qihoo/security/h/e;)V

    goto :goto_0
.end method

.method protected a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 119
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/h/j;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 120
    iget-object v0, p0, Lcom/qihoo/security/h/j;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    :cond_0
    return-void
.end method

.method protected a()Z
    .locals 1

    .prologue
    .line 115
    const/4 v0, 0x1

    return v0
.end method

.method protected b(Lcom/qihoo/security/h/e;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 100
    iget v0, p0, Lcom/qihoo/security/h/j;->a:I

    invoke-virtual {p1, v0}, Lcom/qihoo/security/h/e;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    invoke-virtual {p1}, Lcom/qihoo/security/h/e;->c()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/qihoo/security/h/j;->a(ILcom/qihoo/security/h/e;)V

    .line 104
    :cond_0
    return-void
.end method

.method protected b(Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 218
    iget-object v0, p0, Lcom/qihoo/security/h/j;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 219
    iget-object v2, p0, Lcom/qihoo/security/h/j;->c:Landroid/content/pm/PackageManager;

    invoke-virtual {v2, v0, p1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    .line 220
    const/4 v0, 0x1

    .line 223
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected c(Lcom/qihoo/security/h/e;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 107
    iget v0, p0, Lcom/qihoo/security/h/j;->a:I

    invoke-virtual {p1, v0}, Lcom/qihoo/security/h/e;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    invoke-virtual {p1}, Lcom/qihoo/security/h/e;->c()I

    move-result v0

    invoke-direct {p0, v0, p1}, Lcom/qihoo/security/h/j;->b(ILcom/qihoo/security/h/e;)Z

    .line 110
    :cond_0
    return-void
.end method
