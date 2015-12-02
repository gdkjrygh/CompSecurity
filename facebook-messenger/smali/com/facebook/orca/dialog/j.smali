.class public Lcom/facebook/orca/dialog/j;
.super Ljava/lang/Object;
.source "MenuDialogParamsBuilder.java"


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/dialog/MenuDialogItem;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/os/Parcelable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/dialog/j;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/facebook/orca/dialog/j;->a:I

    return v0
.end method

.method public a(I)Lcom/facebook/orca/dialog/j;
    .locals 0

    .prologue
    .line 26
    iput p1, p0, Lcom/facebook/orca/dialog/j;->a:I

    .line 27
    return-object p0
.end method

.method public a(Landroid/os/Parcelable;)Lcom/facebook/orca/dialog/j;
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/facebook/orca/dialog/j;->d:Landroid/os/Parcelable;

    .line 59
    return-object p0
.end method

.method public a(Lcom/facebook/orca/dialog/MenuDialogItem;)Lcom/facebook/orca/dialog/j;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/orca/dialog/j;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/orca/dialog/j;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/dialog/MenuDialogItem;",
            ">;"
        }
    .end annotation

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/orca/dialog/j;->c:Ljava/util/List;

    return-object v0
.end method

.method public d()Landroid/os/Parcelable;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/dialog/j;->d:Landroid/os/Parcelable;

    return-object v0
.end method

.method public e()Lcom/facebook/orca/dialog/MenuDialogParams;
    .locals 1

    .prologue
    .line 63
    new-instance v0, Lcom/facebook/orca/dialog/MenuDialogParams;

    invoke-direct {v0, p0}, Lcom/facebook/orca/dialog/MenuDialogParams;-><init>(Lcom/facebook/orca/dialog/j;)V

    return-object v0
.end method
