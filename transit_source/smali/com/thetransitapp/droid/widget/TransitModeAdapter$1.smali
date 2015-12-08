.class Lcom/thetransitapp/droid/widget/TransitModeAdapter$1;
.super Ljava/lang/Object;
.source "TransitModeAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/widget/TransitModeAdapter;->showCurrentRegion(Lcom/thetransitapp/droid/widget/OptionItem;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/widget/TransitModeAdapter;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/widget/TransitModeAdapter;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 158
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    # getter for: Lcom/thetransitapp/droid/widget/TransitModeAdapter;->fragmentManager:Landroid/support/v4/app/FragmentManager;
    invoke-static {v2}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->access$2(Lcom/thetransitapp/droid/widget/TransitModeAdapter;)Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 159
    new-instance v0, Lcom/thetransitapp/droid/LegalScreen;

    invoke-direct {v0}, Lcom/thetransitapp/droid/LegalScreen;-><init>()V

    .line 161
    .local v0, "fragment":Landroid/support/v4/app/Fragment;
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    # getter for: Lcom/thetransitapp/droid/widget/TransitModeAdapter;->fragmentManager:Landroid/support/v4/app/FragmentManager;
    invoke-static {v2}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->access$2(Lcom/thetransitapp/droid/widget/TransitModeAdapter;)Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 162
    .local v1, "transaction":Landroid/support/v4/app/FragmentTransaction;
    const v2, 0x7f05003a

    sget-object v3, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LEGAL_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v0, v3}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 163
    sget-object v2, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LEGAL_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 164
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 166
    .end local v0    # "fragment":Landroid/support/v4/app/Fragment;
    .end local v1    # "transaction":Landroid/support/v4/app/FragmentTransaction;
    :cond_0
    return-void
.end method
