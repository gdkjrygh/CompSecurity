.class public Lcom/facebook/analytics/cg;
.super Ljava/lang/Object;
.source "InteractionLogger.java"


# instance fields
.field private final a:Lcom/facebook/analytics/av;

.field private final b:Lcom/facebook/analytics/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    invoke-static {p1}, Lcom/facebook/analytics/i/c;->a(Landroid/content/Context;)Lcom/facebook/analytics/av;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/cg;->a:Lcom/facebook/analytics/av;

    .line 45
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 46
    const-class v1, Lcom/facebook/analytics/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/a;

    iput-object v0, p0, Lcom/facebook/analytics/cg;->b:Lcom/facebook/analytics/a;

    .line 47
    return-void
.end method

.method public constructor <init>(Lcom/facebook/analytics/av;Lcom/facebook/analytics/a;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/facebook/analytics/cg;->a:Lcom/facebook/analytics/av;

    .line 53
    iput-object p2, p0, Lcom/facebook/analytics/cg;->b:Lcom/facebook/analytics/a;

    .line 54
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/analytics/ch;Ljava/lang/String;Ljava/lang/String;J)Lcom/facebook/analytics/cb;
    .locals 3

    .prologue
    .line 133
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "content"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "flags"

    invoke-virtual {p1}, Lcom/facebook/analytics/ch;->getValue()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 135
    invoke-virtual {v0, p4, p5}, Lcom/facebook/analytics/cb;->a(J)Lcom/facebook/analytics/ca;

    .line 137
    if-eqz p2, :cond_0

    .line 138
    invoke-virtual {v0, p2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 141
    :cond_0
    if-eqz p3, :cond_1

    .line 142
    invoke-virtual {v0, p3}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 145
    :cond_1
    return-object v0
.end method
