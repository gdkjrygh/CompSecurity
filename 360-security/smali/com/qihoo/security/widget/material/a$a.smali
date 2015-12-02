.class Lcom/qihoo/security/widget/material/a$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/widget/material/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/widget/material/a;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/widget/material/a;)V
    .locals 0

    .prologue
    .line 700
    iput-object p1, p0, Lcom/qihoo/security/widget/material/a$a;->a:Lcom/qihoo/security/widget/material/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/widget/material/a;Lcom/qihoo/security/widget/material/a$1;)V
    .locals 0

    .prologue
    .line 700
    invoke-direct {p0, p1}, Lcom/qihoo/security/widget/material/a$a;-><init>(Lcom/qihoo/security/widget/material/a;)V

    return-void
.end method

.method private a(Landroid/widget/AdapterView;)V
    .locals 4

    .prologue
    .line 713
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a$a;->a:Lcom/qihoo/security/widget/material/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/material/a;->a(Lcom/qihoo/security/widget/material/a;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    move-result v2

    .line 714
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    invoke-interface {v0, v2}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v0

    .line 715
    :goto_0
    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    .line 716
    iget-object v3, p0, Lcom/qihoo/security/widget/material/a$a;->a:Lcom/qihoo/security/widget/material/a;

    invoke-static {v3}, Lcom/qihoo/security/widget/material/a;->a(Lcom/qihoo/security/widget/material/a;)Landroid/view/View;

    move-result-object v3

    invoke-virtual {p1, v3, v2, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    .line 718
    :cond_0
    return-void

    .line 714
    :cond_1
    const-wide/16 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 704
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a$a;->a:Lcom/qihoo/security/widget/material/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/material/a;->a(Lcom/qihoo/security/widget/material/a;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/AdapterView;

    if-eqz v0, :cond_0

    .line 705
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a$a;->a:Lcom/qihoo/security/widget/material/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/material/a;->a(Lcom/qihoo/security/widget/material/a;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/AdapterView;

    invoke-direct {p0, v0}, Lcom/qihoo/security/widget/material/a$a;->a(Landroid/widget/AdapterView;)V

    .line 707
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a$a;->a:Lcom/qihoo/security/widget/material/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/material/a;->h(Lcom/qihoo/security/widget/material/a;)Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 708
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a$a;->a:Lcom/qihoo/security/widget/material/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/material/a;->h(Lcom/qihoo/security/widget/material/a;)Landroid/view/View$OnClickListener;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/widget/material/a$a;->a:Lcom/qihoo/security/widget/material/a;

    invoke-static {v1}, Lcom/qihoo/security/widget/material/a;->a(Lcom/qihoo/security/widget/material/a;)Landroid/view/View;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 710
    :cond_1
    return-void
.end method
