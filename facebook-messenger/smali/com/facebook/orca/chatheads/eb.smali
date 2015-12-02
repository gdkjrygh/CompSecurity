.class public Lcom/facebook/orca/chatheads/eb;
.super Ljava/lang/Object;
.source "ScreenInsetsChangeDetector.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/view/WindowManager;

.field private c:Lcom/facebook/orca/chatheads/ee;

.field private d:Lcom/facebook/orca/chatheads/ec;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/WindowManager;)V
    .locals 0

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, Lcom/facebook/orca/chatheads/eb;->a:Landroid/content/Context;

    .line 78
    iput-object p2, p0, Lcom/facebook/orca/chatheads/eb;->b:Landroid/view/WindowManager;

    .line 79
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/eb;)Lcom/facebook/orca/chatheads/ec;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/orca/chatheads/eb;->d:Lcom/facebook/orca/chatheads/ec;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/orca/chatheads/eb;->c:Lcom/facebook/orca/chatheads/ee;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 83
    new-instance v0, Lcom/facebook/orca/chatheads/ee;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/eb;->b:Landroid/view/WindowManager;

    invoke-direct {v0, v1}, Lcom/facebook/orca/chatheads/ee;-><init>(Landroid/view/WindowManager;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/eb;->c:Lcom/facebook/orca/chatheads/ee;

    .line 84
    iget-object v0, p0, Lcom/facebook/orca/chatheads/eb;->c:Lcom/facebook/orca/chatheads/ee;

    new-instance v1, Lcom/facebook/orca/chatheads/ed;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/eb;->a:Landroid/content/Context;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/chatheads/ed;-><init>(Lcom/facebook/orca/chatheads/eb;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ee;->a(Landroid/view/View;)V

    .line 85
    iget-object v0, p0, Lcom/facebook/orca/chatheads/eb;->c:Lcom/facebook/orca/chatheads/ee;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ee;->a()V

    .line 86
    return-void

    .line 82
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/chatheads/ec;)V
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lcom/facebook/orca/chatheads/eb;->d:Lcom/facebook/orca/chatheads/ec;

    .line 90
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 93
    iget-object v0, p0, Lcom/facebook/orca/chatheads/eb;->c:Lcom/facebook/orca/chatheads/ee;

    if-eqz v0, :cond_0

    .line 94
    iput-object v1, p0, Lcom/facebook/orca/chatheads/eb;->d:Lcom/facebook/orca/chatheads/ec;

    .line 95
    iget-object v0, p0, Lcom/facebook/orca/chatheads/eb;->c:Lcom/facebook/orca/chatheads/ee;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ee;->b()V

    .line 96
    iput-object v1, p0, Lcom/facebook/orca/chatheads/eb;->c:Lcom/facebook/orca/chatheads/ee;

    .line 98
    :cond_0
    return-void
.end method
