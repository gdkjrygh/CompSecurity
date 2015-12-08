.class final Lcom/cm/kinfoc/ad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/cm/kinfoc/z;

.field private b:Ljava/lang/Boolean;

.field private final c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/cm/kinfoc/z;)V
    .locals 1

    .prologue
    .line 149
    iput-object p1, p0, Lcom/cm/kinfoc/ad;->a:Lcom/cm/kinfoc/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/cm/kinfoc/ad;->b:Ljava/lang/Boolean;

    .line 151
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/cm/kinfoc/ad;->c:Ljava/lang/Object;

    return-void
.end method

.method static synthetic a(Lcom/cm/kinfoc/ad;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    .prologue
    .line 149
    iput-object p1, p0, Lcom/cm/kinfoc/ad;->b:Ljava/lang/Boolean;

    return-object p1
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 155
    iget-object v1, p0, Lcom/cm/kinfoc/ad;->c:Ljava/lang/Object;

    monitor-enter v1

    .line 156
    :try_start_0
    iget-object v0, p0, Lcom/cm/kinfoc/ad;->b:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 157
    const-string v0, "Auto Post"

    invoke-static {v0}, Lcom/cm/kinfoc/a/f;->a(Ljava/lang/String;)V

    .line 159
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/cm/kinfoc/ad;->b:Ljava/lang/Boolean;

    .line 161
    new-instance v0, Lcom/cm/kinfoc/ae;

    invoke-direct {v0, p0}, Lcom/cm/kinfoc/ae;-><init>(Lcom/cm/kinfoc/ad;)V

    invoke-virtual {v0}, Lcom/cm/kinfoc/ae;->start()V

    .line 172
    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
