.class public final Lcom/roidapp/cloudlib/sns/basepost/aw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/roidapp/cloudlib/sns/basepost/bb;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/bb;)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/aw;->a:Lcom/roidapp/cloudlib/sns/basepost/bb;

    .line 13
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/basepost/aw;)Lcom/roidapp/cloudlib/sns/basepost/bb;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aw;->a:Lcom/roidapp/cloudlib/sns/basepost/bb;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;IIII)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, -0x1

    .line 24
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 28
    if-eq p2, v2, :cond_0

    .line 29
    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 32
    :cond_0
    if-eq p3, v2, :cond_1

    .line 33
    invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 35
    :cond_1
    if-eq p4, v2, :cond_2

    .line 36
    new-instance v1, Lcom/roidapp/cloudlib/sns/basepost/ax;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/basepost/ax;-><init>(Lcom/roidapp/cloudlib/sns/basepost/aw;)V

    invoke-virtual {v0, p4, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 46
    :cond_2
    if-eq p5, v2, :cond_3

    .line 47
    new-instance v1, Lcom/roidapp/cloudlib/sns/basepost/ay;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/basepost/ay;-><init>(Lcom/roidapp/cloudlib/sns/basepost/aw;)V

    invoke-virtual {v0, p5, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 59
    :cond_3
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 60
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 61
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 62
    return-void
.end method
