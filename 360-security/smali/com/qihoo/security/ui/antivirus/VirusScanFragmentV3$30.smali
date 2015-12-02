.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Z

.field final synthetic c:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;ZZ)V
    .locals 0

    .prologue
    .line 2982
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->c:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iput-boolean p2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->a:Z

    iput-boolean p3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->b:Z

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 2985
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->c:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->I(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[I

    move-result-object v0

    .line 2986
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->c:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[I

    move-result-object v1

    .line 2987
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->c:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->J(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I

    move-result v2

    .line 2988
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->c:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    aget v4, v0, v6

    aget v5, v1, v6

    add-int/2addr v4, v5

    add-int/2addr v4, v2

    invoke-static {v3, v4}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;I)I

    .line 2989
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->c:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->al(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/vo/a;

    move-result-object v3

    if-nez v3, :cond_0

    .line 2990
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->c:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    new-instance v4, Lcom/qihoo/security/malware/vo/a;

    invoke-direct {v4, v0, v1, v2}, Lcom/qihoo/security/malware/vo/a;-><init>([I[II)V

    invoke-static {v3, v4}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Lcom/qihoo/security/malware/vo/a;)Lcom/qihoo/security/malware/vo/a;

    .line 2996
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->c:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->au(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 2997
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->c:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->al(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/vo/a;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 2998
    const/4 v1, 0x2

    iput v1, v0, Landroid/os/Message;->what:I

    .line 2999
    iget-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->a:Z

    if-eqz v1, :cond_1

    .line 3000
    iput v7, v0, Landroid/os/Message;->arg1:I

    .line 3004
    :goto_1
    iget-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->b:Z

    if-eqz v1, :cond_2

    .line 3005
    iput v7, v0, Landroid/os/Message;->arg2:I

    .line 3009
    :goto_2
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->c:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->av(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendMessage(Landroid/os/Message;)Z

    .line 3010
    return-void

    .line 2992
    :cond_0
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->c:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->al(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/vo/a;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/qihoo/security/malware/vo/a;->a([I)V

    .line 2993
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->c:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->al(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/vo/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/malware/vo/a;->b([I)V

    .line 2994
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->c:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->al(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/vo/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/malware/vo/a;->a(I)V

    goto :goto_0

    .line 3002
    :cond_1
    iput v6, v0, Landroid/os/Message;->arg1:I

    goto :goto_1

    .line 3007
    :cond_2
    iput v6, v0, Landroid/os/Message;->arg2:I

    goto :goto_2
.end method
