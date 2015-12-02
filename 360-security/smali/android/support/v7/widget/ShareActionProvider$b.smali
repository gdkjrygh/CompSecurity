.class Landroid/support/v7/widget/ShareActionProvider$b;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/ShareActionProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/ShareActionProvider;


# direct methods
.method private constructor <init>(Landroid/support/v7/widget/ShareActionProvider;)V
    .locals 0

    .prologue
    .line 341
    iput-object p1, p0, Landroid/support/v7/widget/ShareActionProvider$b;->a:Landroid/support/v7/widget/ShareActionProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/widget/ShareActionProvider;Landroid/support/v7/widget/ShareActionProvider$1;)V
    .locals 0

    .prologue
    .line 341
    invoke-direct {p0, p1}, Landroid/support/v7/widget/ShareActionProvider$b;-><init>(Landroid/support/v7/widget/ShareActionProvider;)V

    return-void
.end method


# virtual methods
.method public onChooseActivity(Landroid/support/v7/internal/widget/ActivityChooserModel;Landroid/content/Intent;)Z
    .locals 2

    .prologue
    .line 344
    iget-object v0, p0, Landroid/support/v7/widget/ShareActionProvider$b;->a:Landroid/support/v7/widget/ShareActionProvider;

    # getter for: Landroid/support/v7/widget/ShareActionProvider;->mOnShareTargetSelectedListener:Landroid/support/v7/widget/ShareActionProvider$a;
    invoke-static {v0}, Landroid/support/v7/widget/ShareActionProvider;->access$400(Landroid/support/v7/widget/ShareActionProvider;)Landroid/support/v7/widget/ShareActionProvider$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 345
    iget-object v0, p0, Landroid/support/v7/widget/ShareActionProvider$b;->a:Landroid/support/v7/widget/ShareActionProvider;

    # getter for: Landroid/support/v7/widget/ShareActionProvider;->mOnShareTargetSelectedListener:Landroid/support/v7/widget/ShareActionProvider$a;
    invoke-static {v0}, Landroid/support/v7/widget/ShareActionProvider;->access$400(Landroid/support/v7/widget/ShareActionProvider;)Landroid/support/v7/widget/ShareActionProvider$a;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/ShareActionProvider$b;->a:Landroid/support/v7/widget/ShareActionProvider;

    invoke-interface {v0, v1, p2}, Landroid/support/v7/widget/ShareActionProvider$a;->a(Landroid/support/v7/widget/ShareActionProvider;Landroid/content/Intent;)Z

    .line 348
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
