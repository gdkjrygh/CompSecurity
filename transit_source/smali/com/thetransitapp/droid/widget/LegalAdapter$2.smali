.class Lcom/thetransitapp/droid/widget/LegalAdapter$2;
.super Ljava/lang/Object;
.source "LegalAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/widget/LegalAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/widget/LegalAdapter;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/widget/LegalAdapter;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/LegalAdapter$2;->this$0:Lcom/thetransitapp/droid/widget/LegalAdapter;

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 86
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/LegalAdapter$2;->this$0:Lcom/thetransitapp/droid/widget/LegalAdapter;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/widget/LegalAdapter;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 87
    .local v0, "dialog":Landroid/app/AlertDialog;
    const-string v1, "Google Play Services"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 88
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/LegalAdapter$2;->this$0:Lcom/thetransitapp/droid/widget/LegalAdapter;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/LegalAdapter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->getOpenSourceSoftwareLicenseInfo(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 89
    const/4 v1, -0x1

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/LegalAdapter$2;->this$0:Lcom/thetransitapp/droid/widget/LegalAdapter;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/widget/LegalAdapter;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0a002f

    invoke-virtual {v2, v3}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    .line 90
    const/4 v3, 0x0

    .line 89
    invoke-virtual {v0, v1, v2, v3}, Landroid/app/AlertDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 91
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 92
    return-void
.end method
