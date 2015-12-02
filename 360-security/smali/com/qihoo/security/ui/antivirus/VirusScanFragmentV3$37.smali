.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$37;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V
    .locals 0

    .prologue
    .line 1160
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$37;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    const/high16 v3, 0x3f800000    # 1.0f

    .line 1164
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 1165
    if-nez v0, :cond_0

    .line 1166
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$37;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ab(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/widget/LinearLayout;

    move-result-object v1

    const v2, 0x3f4ccccd    # 0.8f

    invoke-static {v1, v2}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 1168
    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1169
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$37;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ab(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-static {v1, v3}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 1171
    :cond_1
    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 1172
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$37;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ab(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-static {v0, v3}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 1174
    :cond_2
    const/4 v0, 0x0

    return v0
.end method
