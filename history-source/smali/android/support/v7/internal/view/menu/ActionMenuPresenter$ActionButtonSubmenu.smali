.class Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;
.super Landroid/support/v7/internal/view/menu/MenuDialogHelper;
.source "ActionMenuPresenter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ActionButtonSubmenu"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;


# direct methods
.method public constructor <init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/SubMenuBuilder;)V
    .locals 1
    .param p2, "subMenu"    # Landroid/support/v7/internal/view/menu/SubMenuBuilder;

    .prologue
    .line 621
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    .line 622
    invoke-direct {p0, p2}, Landroid/support/v7/internal/view/menu/MenuDialogHelper;-><init>(Landroid/support/v7/internal/view/menu/MenuBuilder;)V

    .line 623
    iget-object v0, p1, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mPopupPresenterCallback:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;

    invoke-virtual {p1, v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V

    .line 624
    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 628
    invoke-super {p0, p1}, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->onDismiss(Landroid/content/DialogInterface;)V

    .line 629
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    const/4 v1, 0x0

    # setter for: Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mActionButtonPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;
    invoke-static {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->access$202(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;)Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;

    .line 630
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    const/4 v1, 0x0

    iput v1, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOpenSubMenuId:I

    .line 631
    return-void
.end method
