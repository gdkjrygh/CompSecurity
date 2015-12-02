.class public Lcom/facebook/orca/threadview/ay;
.super Lcom/facebook/widget/d;
.source "ThreadTitleHeader.java"


# instance fields
.field private final a:Lcom/facebook/orca/p/b;

.field private final b:Landroid/widget/ImageView;

.field private final c:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

.field private d:Lcom/facebook/l/x;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 31
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/threadview/ay;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/threadview/ay;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 39
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    sget-object v0, Lcom/facebook/l/x;->a:Lcom/facebook/l/x;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ay;->d:Lcom/facebook/l/x;

    .line 41
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ay;->getInjector()Lcom/facebook/inject/t;

    move-result-object v0

    .line 42
    const-class v1, Lcom/facebook/orca/p/b;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/p/b;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ay;->a:Lcom/facebook/orca/p/b;

    .line 44
    sget v0, Lcom/facebook/k;->orca_thread_title_header:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ay;->setContentView(I)V

    .line 45
    sget v0, Lcom/facebook/i;->thread_title_header_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ay;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ay;->c:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    .line 46
    sget v0, Lcom/facebook/i;->thread_title_header_image:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ay;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ay;->b:Landroid/widget/ImageView;

    .line 48
    new-instance v0, Lcom/facebook/orca/threadview/az;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadview/az;-><init>(Lcom/facebook/orca/threadview/ay;)V

    .line 54
    iget-object v1, p0, Lcom/facebook/orca/threadview/ay;->a:Lcom/facebook/orca/p/b;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/p/b;->a(Lcom/facebook/orca/p/d;)V

    .line 55
    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 89
    iget-object v0, p0, Lcom/facebook/orca/threadview/ay;->d:Lcom/facebook/l/x;

    invoke-virtual {v0}, Lcom/facebook/l/x;->a()Lcom/facebook/l/a;

    move-result-object v0

    sget-object v1, Lcom/facebook/l/a;->AVAILABLE:Lcom/facebook/l/a;

    if-ne v0, v1, :cond_0

    .line 90
    iget-object v0, p0, Lcom/facebook/orca/threadview/ay;->b:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_online_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 91
    iget-object v0, p0, Lcom/facebook/orca/threadview/ay;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 98
    :goto_0
    return-void

    .line 92
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ay;->d:Lcom/facebook/l/x;

    invoke-virtual {v0}, Lcom/facebook/l/x;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 93
    iget-object v0, p0, Lcom/facebook/orca/threadview/ay;->b:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_mobile_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 94
    iget-object v0, p0, Lcom/facebook/orca/threadview/ay;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 96
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ay;->b:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/l/x;)V
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/orca/threadview/ay;->d:Lcom/facebook/l/x;

    if-ne v0, p1, :cond_0

    .line 81
    :goto_0
    return-void

    .line 80
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ay;->b(Lcom/facebook/l/x;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ay;Lcom/facebook/l/x;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ay;->a(Lcom/facebook/l/x;)V

    return-void
.end method

.method private b(Lcom/facebook/l/x;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lcom/facebook/orca/threadview/ay;->d:Lcom/facebook/l/x;

    .line 85
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ay;->a()V

    .line 86
    return-void
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .locals 2

    .prologue
    .line 59
    invoke-super {p0}, Lcom/facebook/widget/d;->onAttachedToWindow()V

    .line 60
    iget-object v0, p0, Lcom/facebook/orca/threadview/ay;->a:Lcom/facebook/orca/p/b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/p/b;->a(Z)V

    .line 61
    iget-object v0, p0, Lcom/facebook/orca/threadview/ay;->a:Lcom/facebook/orca/p/b;

    invoke-virtual {v0}, Lcom/facebook/orca/p/b;->c()Lcom/facebook/l/x;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ay;->b(Lcom/facebook/l/x;)V

    .line 62
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    .line 66
    invoke-super {p0}, Lcom/facebook/widget/d;->onDetachedFromWindow()V

    .line 67
    iget-object v0, p0, Lcom/facebook/orca/threadview/ay;->a:Lcom/facebook/orca/p/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/p/b;->a(Z)V

    .line 68
    return-void
.end method

.method public setThreadNameViewData(Lcom/facebook/orca/threadview/v;)V
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/threadview/ay;->c:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    invoke-virtual {v0, p1}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->setData(Ljava/lang/Object;)V

    .line 72
    iget-object v0, p0, Lcom/facebook/orca/threadview/ay;->a:Lcom/facebook/orca/p/b;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/p/b;->a(Lcom/facebook/orca/threadview/v;)V

    .line 73
    iget-object v0, p0, Lcom/facebook/orca/threadview/ay;->a:Lcom/facebook/orca/p/b;

    invoke-virtual {v0}, Lcom/facebook/orca/p/b;->c()Lcom/facebook/l/x;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ay;->b(Lcom/facebook/l/x;)V

    .line 74
    return-void
.end method
