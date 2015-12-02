.class public Lcom/qihoo/security/ui/result/view/VirusResultFragment;
.super Lcom/qihoo/security/ui/result/view/BaseResultFragment;
.source "360Security"


# static fields
.field private static v:Lcom/qihoo/security/ui/result/view/VirusResultFragment;


# instance fields
.field private u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->v:Lcom/qihoo/security/ui/result/view/VirusResultFragment;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;-><init>()V

    return-void
.end method

.method public static declared-synchronized q()Lcom/qihoo/security/ui/result/view/VirusResultFragment;
    .locals 3

    .prologue
    .line 34
    const-class v1, Lcom/qihoo/security/ui/result/view/VirusResultFragment;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->v:Lcom/qihoo/security/ui/result/view/VirusResultFragment;

    if-nez v0, :cond_0

    .line 35
    new-instance v0, Lcom/qihoo/security/ui/result/view/VirusResultFragment;

    invoke-direct {v0}, Lcom/qihoo/security/ui/result/view/VirusResultFragment;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->v:Lcom/qihoo/security/ui/result/view/VirusResultFragment;

    .line 36
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 37
    sget-object v2, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->v:Lcom/qihoo/security/ui/result/view/VirusResultFragment;

    invoke-virtual {v2, v0}, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->setArguments(Landroid/os/Bundle;)V

    .line 39
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->v:Lcom/qihoo/security/ui/result/view/VirusResultFragment;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 34
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public a(Lcom/qihoo/security/ui/result/card/a;)V
    .locals 1

    .prologue
    .line 135
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Lcom/qihoo/security/ui/result/card/a;)V

    .line 136
    if-nez p1, :cond_0

    .line 179
    :goto_0
    return-void

    .line 139
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->l()I

    move-result v0

    .line 140
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 142
    :pswitch_0
    iget v0, p1, Lcom/qihoo/security/ui/result/card/a;->a:I

    packed-switch v0, :pswitch_data_1

    goto :goto_0

    .line 144
    :pswitch_1
    const/16 v0, 0x37e0

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_0

    .line 161
    :pswitch_2
    iget v0, p1, Lcom/qihoo/security/ui/result/card/a;->a:I

    goto :goto_0

    .line 140
    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
        :pswitch_2
    .end packed-switch

    .line 142
    :pswitch_data_1
    .packed-switch 0x8
        :pswitch_1
    .end packed-switch
.end method

.method public a(Ljava/lang/Boolean;)V
    .locals 1

    .prologue
    .line 43
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->u:Z

    .line 44
    return-void
.end method

.method protected d()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 73
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->d:Landroid/content/Context;

    const-string/jumbo v1, "repair_issue_number"

    invoke-static {v0, v1, v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 77
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->d:Landroid/content/Context;

    const-wide/16 v2, 0x0

    invoke-static {v1, v4, v2, v3, v0}, Lcom/qihoo360/mobilesafe/share/c;->a(Landroid/content/Context;IJI)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 78
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c00cb

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 79
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 80
    if-eqz v1, :cond_0

    .line 81
    const/4 v2, 0x2

    invoke-static {v1, v0, v2}, Lcom/qihoo360/mobilesafe/share/c;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->d:Landroid/content/Context;

    const-string/jumbo v1, "repair_issue_number"

    invoke-static {v0, v1, v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 86
    return-void
.end method

.method protected l()I
    .locals 1

    .prologue
    .line 93
    iget-boolean v0, p0, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->u:Z

    if-eqz v0, :cond_0

    .line 94
    const/4 v0, 0x6

    .line 96
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x5

    goto :goto_0
.end method

.method protected m()V
    .locals 2

    .prologue
    .line 106
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->n:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0103

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 107
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->o:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0128

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 108
    return-void
.end method

.method protected n()V
    .locals 0

    .prologue
    .line 102
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 68
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 69
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x2

    .line 112
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->onClick(Landroid/view/View;)V

    .line 113
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 131
    :goto_0
    return-void

    .line 115
    :sswitch_0
    iget-boolean v0, p0, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->u:Z

    if-eqz v0, :cond_0

    .line 116
    const/16 v0, 0x37f8

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_0

    .line 118
    :cond_0
    const/16 v0, 0x37f7

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_0

    .line 122
    :sswitch_1
    iget-boolean v0, p0, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->u:Z

    if-eqz v0, :cond_1

    .line 123
    const/16 v0, 0x37f6

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto :goto_0

    .line 125
    :cond_1
    const/16 v0, 0x37f5

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto :goto_0

    .line 113
    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0b009f -> :sswitch_0
        0x7f0b00f6 -> :sswitch_1
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 48
    invoke-static {}, Lcom/qihoo/security/ui/b/b;->a()V

    .line 49
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->onCreate(Landroid/os/Bundle;)V

    .line 51
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 55
    invoke-super {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->onResume()V

    .line 56
    const/16 v0, 0x15

    invoke-static {v0}, Lcom/qihoo/security/ui/b/b;->a(I)V

    .line 57
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->o()V

    .line 58
    invoke-static {}, Lcom/qihoo/security/recommend/RecommendHelper;->a()Lcom/qihoo/security/recommend/RecommendHelper;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Anitvirus:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/recommend/RecommendHelper;->d(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V

    .line 59
    return-void
.end method

.method protected p()I
    .locals 1

    .prologue
    .line 63
    const/16 v0, 0x16

    return v0
.end method
