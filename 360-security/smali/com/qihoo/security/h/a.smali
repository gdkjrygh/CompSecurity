.class public Lcom/qihoo/security/h/a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/h/a$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;

.field private static e:Lcom/qihoo/security/h/a;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/content/pm/PackageManager;

.field private final d:Landroid/graphics/drawable/Drawable;

.field private final f:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/h/a$a;",
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
            "Lcom/qihoo/security/permission/AppInfoLoader$PackageChain;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Landroid/os/Handler;

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/qihoo/security/h/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/h/a;->a:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/h/a;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/h/a;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/qihoo/security/h/a;->h:Landroid/os/Handler;

    .line 98
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/h/a;->i:Z

    .line 40
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/h/a;->b:Landroid/content/Context;

    .line 41
    iget-object v0, p0, Lcom/qihoo/security/h/a;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/h/a;->c:Landroid/content/pm/PackageManager;

    .line 42
    const/4 v0, 0x0

    .line 45
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/h/a;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020043

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 48
    :goto_0
    iput-object v0, p0, Lcom/qihoo/security/h/a;->d:Landroid/graphics/drawable/Drawable;

    .line 49
    return-void

    .line 46
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static a()Lcom/qihoo/security/h/a;
    .locals 3

    .prologue
    .line 52
    const-class v1, Lcom/qihoo/security/h/a;

    monitor-enter v1

    .line 53
    :try_start_0
    sget-object v0, Lcom/qihoo/security/h/a;->e:Lcom/qihoo/security/h/a;

    if-nez v0, :cond_0

    .line 54
    new-instance v0, Lcom/qihoo/security/h/a;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/qihoo/security/h/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/security/h/a;->e:Lcom/qihoo/security/h/a;

    .line 56
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    sget-object v0, Lcom/qihoo/security/h/a;->e:Lcom/qihoo/security/h/a;

    return-object v0

    .line 56
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static b()Z
    .locals 1

    .prologue
    .line 61
    sget-object v0, Lcom/qihoo/security/h/a;->e:Lcom/qihoo/security/h/a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c()V
    .locals 3

    .prologue
    .line 119
    iget-object v0, p0, Lcom/qihoo/security/h/a;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 120
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 121
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/h/a$a;

    .line 122
    if-nez v0, :cond_1

    .line 123
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 124
    :cond_1
    iget-boolean v2, v0, Lcom/qihoo/security/h/a$a;->b:Z

    if-nez v2, :cond_2

    iget-object v2, v0, Lcom/qihoo/security/h/a$a;->c:Landroid/content/pm/ApplicationInfo;

    if-nez v2, :cond_3

    .line 125
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 126
    :cond_3
    iget v0, v0, Lcom/qihoo/security/h/a$a;->a:I

    const/4 v2, 0x5

    if-ge v0, v2, :cond_0

    .line 127
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 133
    :cond_4
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 134
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 351
    iget-object v0, p0, Lcom/qihoo/security/h/a;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    iget-object v0, p0, Lcom/qihoo/security/h/a;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    return-void
.end method

.method public b(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 357
    iget-object v0, p0, Lcom/qihoo/security/h/a;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    iget-object v0, p0, Lcom/qihoo/security/h/a;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 141
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 153
    :goto_0
    return v1

    .line 143
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/h/a;->h:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 144
    invoke-direct {p0}, Lcom/qihoo/security/h/a;->c()V

    .line 145
    iput-boolean v1, p0, Lcom/qihoo/security/h/a;->i:Z

    .line 146
    iget-object v0, p0, Lcom/qihoo/security/h/a;->h:Landroid/os/Handler;

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 147
    iget-object v0, p0, Lcom/qihoo/security/h/a;->h:Landroid/os/Handler;

    const-wide/16 v2, 0x3a98

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 150
    :pswitch_1
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_0

    .line 141
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
