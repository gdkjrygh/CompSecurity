.class public Lcom/facebook/orca/server/module/a;
.super Lcom/facebook/inject/c;
.source "MessagesServiceModule.java"


# instance fields
.field private a:Lcom/facebook/fbservice/service/p;

.field private b:Lcom/facebook/fbservice/a/a;

.field private c:Lcom/facebook/fbservice/a/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 299
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/server/module/a;)Lcom/facebook/fbservice/a/a;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/orca/server/module/a;->b:Lcom/facebook/fbservice/a/a;

    return-object v0
.end method

.method private a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/service/OperationType;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 179
    iget-object v0, p0, Lcom/facebook/orca/server/module/a;->a:Lcom/facebook/fbservice/service/p;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 180
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/service/OperationType;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 186
    iget-object v0, p0, Lcom/facebook/orca/server/module/a;->a:Lcom/facebook/fbservice/service/p;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 187
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/server/module/a;)Lcom/facebook/fbservice/a/b;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/orca/server/module/a;->c:Lcom/facebook/fbservice/a/b;

    return-object v0
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 55
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/server/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/server/module/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/server/module/h;-><init>(Lcom/facebook/orca/server/module/a;Lcom/facebook/orca/server/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 59
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/server/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/server/module/e;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/server/module/e;-><init>(Lcom/facebook/orca/server/module/a;Lcom/facebook/orca/server/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 64
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/server/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/server/module/SendQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/server/module/i;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/server/module/i;-><init>(Lcom/facebook/orca/server/module/a;Lcom/facebook/orca/server/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 68
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/server/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/server/module/PushQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/server/module/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/server/module/g;-><init>(Lcom/facebook/orca/server/module/a;Lcom/facebook/orca/server/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 72
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/server/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/server/module/LocationQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/server/module/d;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/server/module/d;-><init>(Lcom/facebook/orca/server/module/a;Lcom/facebook/orca/server/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 76
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/server/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/server/module/ImageSearchQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/server/module/c;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/server/module/c;-><init>(Lcom/facebook/orca/server/module/a;Lcom/facebook/orca/server/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 80
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/server/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/server/module/PhoneNumberIdentificationQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/server/module/f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/server/module/f;-><init>(Lcom/facebook/orca/server/module/a;Lcom/facebook/orca/server/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 84
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/server/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/server/module/WildfireQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/server/module/m;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/server/module/m;-><init>(Lcom/facebook/orca/server/module/a;Lcom/facebook/orca/server/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 88
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/server/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/server/module/StickersQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/server/module/j;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/server/module/j;-><init>(Lcom/facebook/orca/server/module/a;Lcom/facebook/orca/server/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 92
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/server/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/server/module/WebrtcQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/server/module/k;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/server/module/k;-><init>(Lcom/facebook/orca/server/module/a;Lcom/facebook/orca/server/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 96
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/server/module/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/server/module/PhotoUploadQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/server/module/l;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/server/module/l;-><init>(Lcom/facebook/orca/server/module/a;Lcom/facebook/orca/server/module/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 100
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 3

    .prologue
    .line 104
    const-class v0, Lcom/facebook/fbservice/service/p;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/p;

    iput-object v0, p0, Lcom/facebook/orca/server/module/a;->a:Lcom/facebook/fbservice/service/p;

    .line 105
    const-class v0, Lcom/facebook/fbservice/a/a;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/a/a;

    iput-object v0, p0, Lcom/facebook/orca/server/module/a;->b:Lcom/facebook/fbservice/a/a;

    .line 106
    const-class v0, Lcom/facebook/fbservice/a/b;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/a/b;

    iput-object v0, p0, Lcom/facebook/orca/server/module/a;->c:Lcom/facebook/fbservice/a/b;

    .line 108
    iget-object v0, p0, Lcom/facebook/orca/server/module/a;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/fbservice/service/LocalQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 109
    iget-object v0, p0, Lcom/facebook/orca/server/module/a;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/orca/server/module/DataThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/MessagesDataQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 111
    iget-object v0, p0, Lcom/facebook/orca/server/module/a;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/orca/server/module/SendQueue;

    const-class v2, Lcom/facebook/orca/server/MessagesDataQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 112
    iget-object v0, p0, Lcom/facebook/orca/server/module/a;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/orca/server/module/PushQueue;

    const-class v2, Lcom/facebook/orca/server/MessagesDataQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 113
    iget-object v0, p0, Lcom/facebook/orca/server/module/a;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/orca/server/module/LocationQueue;

    const-class v2, Lcom/facebook/orca/server/MessagesDataQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 114
    iget-object v0, p0, Lcom/facebook/orca/server/module/a;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/orca/server/module/ImageSearchQueue;

    const-class v2, Lcom/facebook/orca/server/MessagesDataQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 115
    iget-object v0, p0, Lcom/facebook/orca/server/module/a;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/orca/server/module/PhoneNumberIdentificationQueue;

    const-class v2, Lcom/facebook/orca/server/MessagesDataQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 117
    iget-object v0, p0, Lcom/facebook/orca/server/module/a;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/orca/server/module/WildfireQueue;

    const-class v2, Lcom/facebook/orca/server/MessagesDataQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 118
    iget-object v0, p0, Lcom/facebook/orca/server/module/a;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/zero/annotations/ZeroTokenQueue;

    const-class v2, Lcom/facebook/orca/server/MessagesDataQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 119
    iget-object v0, p0, Lcom/facebook/orca/server/module/a;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/orca/server/module/StickersQueue;

    const-class v2, Lcom/facebook/orca/server/MessagesDataQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 120
    iget-object v0, p0, Lcom/facebook/orca/server/module/a;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/orca/server/module/WebrtcQueue;

    const-class v2, Lcom/facebook/orca/server/MessagesDataQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 121
    iget-object v0, p0, Lcom/facebook/orca/server/module/a;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/orca/server/module/PhotoUploadQueue;

    const-class v2, Lcom/facebook/orca/server/MessagesDataQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 124
    sget-object v0, Lcom/facebook/orca/server/aq;->a:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/WildfireQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 125
    sget-object v0, Lcom/facebook/orca/server/aq;->b:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/WildfireQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 126
    sget-object v0, Lcom/facebook/orca/server/aq;->c:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/WildfireQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 127
    sget-object v0, Lcom/facebook/orca/server/aq;->d:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/WildfireQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 128
    sget-object v0, Lcom/facebook/orca/server/aq;->D:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/WildfireQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 131
    sget-object v0, Lcom/facebook/orca/server/aq;->e:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 132
    sget-object v0, Lcom/facebook/orca/server/aq;->f:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 133
    sget-object v0, Lcom/facebook/orca/server/aq;->g:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 134
    sget-object v0, Lcom/facebook/orca/server/aq;->h:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 135
    sget-object v0, Lcom/facebook/orca/server/aq;->i:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 136
    sget-object v0, Lcom/facebook/orca/server/aq;->j:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 137
    sget-object v0, Lcom/facebook/orca/server/aq;->k:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 138
    sget-object v0, Lcom/facebook/orca/server/aq;->m:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 139
    sget-object v0, Lcom/facebook/orca/server/aq;->n:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 140
    sget-object v0, Lcom/facebook/orca/server/aq;->o:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 141
    sget-object v0, Lcom/facebook/orca/server/aq;->p:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 142
    sget-object v0, Lcom/facebook/orca/server/aq;->q:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 143
    sget-object v0, Lcom/facebook/orca/server/aq;->r:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 144
    sget-object v0, Lcom/facebook/orca/server/aq;->s:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 145
    sget-object v0, Lcom/facebook/orca/server/aq;->u:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 146
    sget-object v0, Lcom/facebook/orca/server/aq;->v:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 147
    sget-object v0, Lcom/facebook/orca/server/aq;->E:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ThreadsQueue;

    const-class v2, Lcom/facebook/orca/server/module/DataThreadsQueue;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 150
    sget-object v0, Lcom/facebook/orca/server/aq;->I:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/StickersQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 151
    sget-object v0, Lcom/facebook/orca/server/aq;->J:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/StickersQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 152
    sget-object v0, Lcom/facebook/orca/server/aq;->K:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/StickersQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 155
    sget-object v0, Lcom/facebook/orca/server/aq;->w:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/SendQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 158
    sget-object v0, Lcom/facebook/orca/server/aq;->L:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/PhotoUploadQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 161
    sget-object v0, Lcom/facebook/orca/server/aq;->x:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/PushQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 162
    sget-object v0, Lcom/facebook/orca/server/aq;->t:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/PushQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 163
    sget-object v0, Lcom/facebook/orca/server/aq;->y:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/PushQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 164
    sget-object v0, Lcom/facebook/orca/server/aq;->F:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/PushQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 167
    sget-object v0, Lcom/facebook/orca/server/aq;->G:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/PhoneNumberIdentificationQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 168
    sget-object v0, Lcom/facebook/orca/server/aq;->H:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/PhoneNumberIdentificationQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 171
    sget-object v0, Lcom/facebook/orca/server/aq;->A:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/LocationQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 172
    sget-object v0, Lcom/facebook/orca/server/aq;->B:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/ImageSearchQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 173
    sget-object v0, Lcom/facebook/zero/server/e;->a:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/zero/annotations/ZeroTokenQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 174
    sget-object v0, Lcom/facebook/zero/server/e;->b:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/zero/annotations/ZeroTokenQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 175
    sget-object v0, Lcom/facebook/orca/server/aq;->z:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/orca/server/module/WebrtcQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/server/module/a;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 176
    return-void
.end method
