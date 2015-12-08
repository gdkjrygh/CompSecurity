.class Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;
.super Ljava/lang/Object;
.source "ActionMenuPresenter.java"

# interfaces
.implements Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PopupPresenterCallback"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;


# direct methods
.method private constructor <init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;)V
    .locals 0

    .prologue
    .line 634
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/ActionMenuPresenter$1;)V
    .locals 0
    .param p1, "x0"    # Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
    .param p2, "x1"    # Landroid/support/v7/internal/view/menu/ActionMenuPresenter$1;

    .prologue
    .line 634
    invoke-direct {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;-><init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;)V

    return-void
.end method


# virtual methods
.method public onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
    .locals 2
    .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
    .param p2, "allMenusAreClosing"    # Z

    .prologue
    .line 648
    instance-of v0, p1, Landroid/support/v7/internal/view/menu/SubMenuBuilder;

    if-eqz v0, :cond_0

    .line 649
    check-cast p1, Landroid/support/v7/internal/view/menu/SubMenuBuilder;

    .end local p1    # "menu":Landroid/support/v7/internal/view/menu/MenuBuilder;
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->getRootMenu()Landroid/support/v7/internal/view/menu/MenuBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close(Z)V

    .line 651
    :cond_0
    return-void
.end method

.method public onOpenSubMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;)Z
    .locals 3
    .param p1, "subMenu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;

    .prologue
    const/4 v2, 0x0

    .line 638
    if-nez p1, :cond_0

    .line 643
    .end local p1    # "subMenu":Landroid/support/v7/internal/view/menu/MenuBuilder;
    :goto_0
    return v2

    .line 642
    .restart local p1    # "subMenu":Landroid/support/v7/internal/view/menu/MenuBuilder;
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    check-cast p1, Landroid/support/v7/internal/view/menu/SubMenuBuilder;

    .end local p1    # "subMenu":Landroid/support/v7/internal/view/menu/MenuBuilder;
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->getItem()Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    iput v1, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOpenSubMenuId:I

    goto :goto_0
.end method
