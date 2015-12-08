.class public Lcom/thetransitapp/droid/widget/ErrorView;
.super Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockFragment;
.source "ErrorView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;
    }
.end annotation


# instance fields
.field private button:Landroid/widget/Button;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050089
    .end annotation
.end field

.field private message:Landroid/widget/TextView;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050088
    .end annotation
.end field

.field private title:Landroid/widget/TextView;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050087
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public displayError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x0

    .line 40
    invoke-virtual {p0, p1, p2, v0, v0}, Lcom/thetransitapp/droid/widget/ErrorView;->displayError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;)V

    .line 41
    return-void
.end method

.method public displayError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;)V
    .locals 2
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "button"    # Ljava/lang/String;
    .param p4, "listener"    # Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;

    .prologue
    const/4 v1, 0x0

    .line 44
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockFragment;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 46
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/ErrorView;->title:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/ErrorView;->message:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    if-eqz p3, :cond_0

    if-eqz p4, :cond_0

    .line 50
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/ErrorView;->button:Landroid/widget/Button;

    invoke-virtual {v0, p3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 51
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/ErrorView;->button:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 53
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/ErrorView;->button:Landroid/widget/Button;

    new-instance v1, Lcom/thetransitapp/droid/widget/ErrorView$1;

    invoke-direct {v1, p0, p4}, Lcom/thetransitapp/droid/widget/ErrorView$1;-><init>(Lcom/thetransitapp/droid/widget/ErrorView;Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    :goto_0
    return-void

    .line 60
    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/ErrorView;->button:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0
.end method

.method public hideError()V
    .locals 2

    .prologue
    .line 65
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockFragment;->getView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 66
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 29
    const v0, 0x7f03002a

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 34
    invoke-super {p0, p1, p2}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 36
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/fragment/RoboSherlockFragment;->getView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 37
    return-void
.end method
