.class final Lcom/qihoo/security/service/SecurityService$b;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/service/SecurityService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/service/SecurityService;

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/service/SecurityService;Landroid/os/Looper;)V
    .locals 1

    .prologue
    .line 736
    iput-object p1, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    .line 737
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 738
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/service/SecurityService$b;->sendEmptyMessage(I)Z

    .line 739
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/service/SecurityService$b;)V
    .locals 0

    .prologue
    .line 714
    invoke-direct {p0}, Lcom/qihoo/security/service/SecurityService$b;->d()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/service/SecurityService$b;Z)V
    .locals 0

    .prologue
    .line 714
    invoke-direct {p0, p1}, Lcom/qihoo/security/service/SecurityService$b;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 4

    .prologue
    const/16 v2, 0x64

    const/4 v1, 0x2

    .line 968
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->r(Lcom/qihoo/security/service/SecurityService;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->s(Lcom/qihoo/security/service/SecurityService;)I

    move-result v0

    if-lez v0, :cond_2

    .line 969
    if-eqz p1, :cond_1

    .line 970
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 971
    iput v1, v0, Landroid/os/Message;->what:I

    .line 972
    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 973
    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v1}, Lcom/qihoo/security/service/SecurityService;->c(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/service/SecurityService$b;->sendMessage(Landroid/os/Message;)Z

    .line 995
    :cond_0
    :goto_0
    return-void

    .line 975
    :cond_1
    invoke-virtual {p0, v1}, Lcom/qihoo/security/service/SecurityService$b;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 977
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 978
    iput v1, v0, Landroid/os/Message;->what:I

    .line 979
    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 980
    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v1}, Lcom/qihoo/security/service/SecurityService;->c(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$b;

    move-result-object v1

    const-wide/16 v2, 0x7530

    invoke-virtual {v1, v0, v2, v3}, Lcom/qihoo/security/service/SecurityService$b;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 987
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->c(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/service/SecurityService$b;->removeMessages(I)V

    .line 988
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/service/SecurityService;->d(Lcom/qihoo/security/service/SecurityService;I)I

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/service/SecurityService$b;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 714
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->c:Ljava/lang/String;

    return-object v0
.end method

.method private b()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 896
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->q(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo360/mobilesafe/core/d/b;

    move-result-object v0

    if-nez v0, :cond_0

    .line 897
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    new-instance v2, Lcom/qihoo360/mobilesafe/core/d/b;

    iget-object v3, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v3}, Lcom/qihoo/security/service/SecurityService;->p(Lcom/qihoo/security/service/SecurityService;)Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/qihoo360/mobilesafe/core/d/b;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v2}, Lcom/qihoo/security/service/SecurityService;->a(Lcom/qihoo/security/service/SecurityService;Lcom/qihoo360/mobilesafe/core/d/b;)Lcom/qihoo360/mobilesafe/core/d/b;

    .line 899
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->q(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo360/mobilesafe/core/d/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/d/b;->a()Ljava/lang/String;

    move-result-object v0

    .line 900
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 902
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->c:Ljava/lang/String;

    .line 904
    :cond_1
    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v2, v1}, Lcom/qihoo/security/service/SecurityService;->a(Lcom/qihoo/security/service/SecurityService;Z)Z

    .line 905
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService$b;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 907
    invoke-static {}, Lcom/qihoo/security/ui/result/a;->a()Lcom/qihoo/security/ui/result/a;

    move-result-object v2

    invoke-virtual {v2, v0, v4}, Lcom/qihoo/security/ui/result/a;->a(Ljava/lang/String;Z)V

    .line 909
    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->c:Ljava/lang/String;

    .line 910
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService$b;->b:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/qihoo/security/service/SecurityService$b;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v0, v2}, Lcom/qihoo/security/service/SecurityService;->b(Lcom/qihoo/security/service/SecurityService;Z)Z

    .line 911
    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->h(Lcom/qihoo/security/service/SecurityService;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    :goto_0
    invoke-static {v2, v0}, Lcom/qihoo/security/service/SecurityService;->c(Lcom/qihoo/security/service/SecurityService;Z)Z

    .line 914
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->h(Lcom/qihoo/security/service/SecurityService;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->p(Lcom/qihoo/security/service/SecurityService;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v2, "clear_default_pre_is_need_run"

    invoke-static {v0, v2, v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 915
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->p(Lcom/qihoo/security/service/SecurityService;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v2, "clear_default_pre_is_need_run"

    invoke-static {v0, v2, v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 918
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->o(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$a;

    move-result-object v0

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lcom/qihoo/security/service/SecurityService$a;->sendEmptyMessage(I)Z

    .line 919
    invoke-direct {p0, v1}, Lcom/qihoo/security/service/SecurityService$b;->b(Z)V

    .line 920
    return-void

    .line 911
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->c:Ljava/lang/String;

    const-string/jumbo v3, "com.qihoo.security.lite"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/service/SecurityService$b;Z)V
    .locals 0

    .prologue
    .line 714
    invoke-direct {p0, p1}, Lcom/qihoo/security/service/SecurityService$b;->b(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 1001
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->r(Lcom/qihoo/security/service/SecurityService;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->t(Lcom/qihoo/security/service/SecurityService;)I

    move-result v0

    if-lez v0, :cond_0

    .line 1002
    if-eqz p1, :cond_1

    .line 1004
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->c(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/service/SecurityService$b;->removeMessages(I)V

    .line 1005
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->c(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/service/SecurityService$b;->sendEmptyMessage(I)Z

    .line 1014
    :cond_0
    :goto_0
    return-void

    .line 1007
    :cond_1
    invoke-virtual {p0, v1}, Lcom/qihoo/security/service/SecurityService$b;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1008
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->c(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$b;

    move-result-object v0

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/service/SecurityService$b;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0
.end method

.method private c()V
    .locals 1

    .prologue
    .line 923
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/qihoo/security/service/SecurityService$b;->sendEmptyMessage(I)Z

    .line 924
    return-void
.end method

.method private d()V
    .locals 1

    .prologue
    .line 927
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/qihoo/security/service/SecurityService$b;->sendEmptyMessage(I)Z

    .line 928
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    const/4 v2, 0x2

    .line 953
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->r(Lcom/qihoo/security/service/SecurityService;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->s(Lcom/qihoo/security/service/SecurityService;)I

    move-result v0

    if-lez v0, :cond_0

    .line 954
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 955
    iput v2, v0, Landroid/os/Message;->what:I

    .line 956
    const/16 v1, 0xc8

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 957
    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v1}, Lcom/qihoo/security/service/SecurityService;->c(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/qihoo/security/service/SecurityService$b;->removeMessages(I)V

    .line 958
    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v1}, Lcom/qihoo/security/service/SecurityService;->c(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/service/SecurityService$b;->sendMessage(Landroid/os/Message;)Z

    .line 960
    :cond_0
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 743
    iget v2, p1, Landroid/os/Message;->what:I

    packed-switch v2, :pswitch_data_0

    .line 829
    :goto_0
    return-void

    .line 745
    :pswitch_0
    invoke-direct {p0}, Lcom/qihoo/security/service/SecurityService$b;->c()V

    .line 746
    invoke-direct {p0}, Lcom/qihoo/security/service/SecurityService$b;->d()V

    goto :goto_0

    .line 749
    :pswitch_1
    invoke-direct {p0}, Lcom/qihoo/security/service/SecurityService$b;->b()V

    goto :goto_0

    .line 753
    :pswitch_2
    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v2}, Lcom/qihoo/security/service/SecurityService;->l(Lcom/qihoo/security/service/SecurityService;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    .line 754
    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {}, Lcom/qihoo360/common/utils/Utils;->getMemoryTotalKb()J

    move-result-wide v4

    invoke-static {v2, v4, v5}, Lcom/qihoo/security/service/SecurityService;->a(Lcom/qihoo/security/service/SecurityService;J)J

    .line 763
    :cond_0
    iget v2, p1, Landroid/os/Message;->arg1:I

    const/16 v3, 0x64

    if-ne v2, v3, :cond_1

    .line 764
    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v2}, Lcom/qihoo/security/service/SecurityService;->m(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v2}, Lcom/qihoo/security/service/SecurityService;->m(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/qihoo360/mobilesafe/core/c;->b()Z

    move-result v2

    if-nez v2, :cond_3

    .line 782
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    .line 783
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->n(Lcom/qihoo/security/service/SecurityService;)I

    move-result v0

    if-lez v0, :cond_4

    .line 785
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v2}, Lcom/qihoo/security/service/SecurityService;->n(Lcom/qihoo/security/service/SecurityService;)I

    move-result v2

    invoke-static {v0, v2}, Lcom/qihoo/security/service/SecurityService;->c(Lcom/qihoo/security/service/SecurityService;I)I

    .line 786
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0, v1}, Lcom/qihoo/security/service/SecurityService;->d(Lcom/qihoo/security/service/SecurityService;I)I

    .line 791
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->o(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$a;

    move-result-object v0

    const/4 v2, 0x5

    invoke-virtual {v0, v2}, Lcom/qihoo/security/service/SecurityService$a;->sendEmptyMessage(I)Z

    .line 794
    :cond_2
    invoke-direct {p0, v1}, Lcom/qihoo/security/service/SecurityService$b;->a(Z)V

    goto :goto_0

    :cond_3
    move v0, v1

    .line 770
    goto :goto_1

    .line 789
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v2}, Lcom/qihoo/security/service/SecurityService;->l(Lcom/qihoo/security/service/SecurityService;)J

    move-result-wide v2

    invoke-static {}, Lcom/qihoo360/common/utils/Utils;->getMemoryFreeKb()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x64

    mul-long/2addr v2, v4

    iget-object v4, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v4}, Lcom/qihoo/security/service/SecurityService;->l(Lcom/qihoo/security/service/SecurityService;)J

    move-result-wide v4

    div-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v0, v2}, Lcom/qihoo/security/service/SecurityService;->c(Lcom/qihoo/security/service/SecurityService;I)I

    goto :goto_2

    .line 801
    :pswitch_3
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->p(Lcom/qihoo/security/service/SecurityService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->getHomeLauncherPackages(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->b:Ljava/util/ArrayList;

    goto/16 :goto_0

    .line 809
    :pswitch_4
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    iget-object v1, p0, Lcom/qihoo/security/service/SecurityService$b;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v1}, Lcom/qihoo/security/service/SecurityService;->p(Lcom/qihoo/security/service/SecurityService;)Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v2, "lock_screen.dat"

    const-string/jumbo v3, "com.qihoo.security.lite"

    invoke-static {v1, v2, v3}, Lcom/qihoo360/common/utils/Utils;->openConfigFileDescrypt(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/service/SecurityService;->a(Lcom/qihoo/security/service/SecurityService;Ljava/util/List;)Ljava/util/List;

    goto/16 :goto_0

    .line 743
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
