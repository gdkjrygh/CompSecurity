.class Lcom/facebook/inject/i;
.super Lcom/facebook/inject/c;
.source "BuiltInModule.java"


# instance fields
.field private final a:Lcom/facebook/inject/n;

.field private final b:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/facebook/inject/n;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/facebook/inject/i;->a:Lcom/facebook/inject/n;

    .line 20
    iput-object p2, p0, Lcom/facebook/inject/i;->b:Landroid/content/Context;

    .line 21
    return-void
.end method

.method static synthetic a(Lcom/facebook/inject/i;)Lcom/facebook/inject/n;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/facebook/inject/i;->a:Lcom/facebook/inject/n;

    return-object v0
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 26
    const-class v0, Lcom/facebook/inject/ContextScoped;

    iget-object v1, p0, Lcom/facebook/inject/i;->a:Lcom/facebook/inject/n;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/inject/i;->a(Ljava/lang/Class;Lcom/facebook/inject/au;)V

    .line 27
    const-class v0, Lcom/facebook/inject/n;

    invoke-virtual {p0, v0}, Lcom/facebook/inject/i;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/inject/i;->a:Lcom/facebook/inject/n;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Object;)V

    .line 28
    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/inject/i;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/inject/k;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/inject/k;-><init>(Lcom/facebook/inject/i;Lcom/facebook/inject/j;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 29
    iget-object v0, p0, Lcom/facebook/inject/i;->a:Lcom/facebook/inject/n;

    iget-object v1, p0, Lcom/facebook/inject/i;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/n;->a(Landroid/content/Context;)V

    .line 30
    return-void
.end method
