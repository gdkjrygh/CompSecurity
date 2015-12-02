.class public Lcom/qihoo/security/ui/result/view/CleanResultFragment;
.super Lcom/qihoo/security/ui/result/view/BaseResultFragment;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;
    }
.end annotation


# instance fields
.field private u:Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;-><init>()V

    .line 98
    return-void
.end method

.method public static a(Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;)Lcom/qihoo/security/ui/result/view/CleanResultFragment;
    .locals 3

    .prologue
    .line 42
    new-instance v0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;

    invoke-direct {v0}, Lcom/qihoo/security/ui/result/view/CleanResultFragment;-><init>()V

    .line 43
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 44
    const-string/jumbo v2, "ms_fragment_data"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 45
    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->setArguments(Landroid/os/Bundle;)V

    .line 46
    return-object v0
.end method


# virtual methods
.method public a(Lcom/qihoo/security/ui/result/card/a;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 156
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Lcom/qihoo/security/ui/result/card/a;)V

    .line 157
    if-nez p1, :cond_1

    .line 200
    :cond_0
    :goto_0
    return-void

    .line 160
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->l()I

    move-result v0

    .line 161
    packed-switch v0, :pswitch_data_0

    .line 193
    :goto_1
    if-eqz p1, :cond_0

    iget v0, p1, Lcom/qihoo/security/ui/result/card/a;->a:I

    const/4 v2, 0x6

    if-ne v0, v2, :cond_0

    .line 194
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->g()Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v2

    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->u:Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->u:Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;

    iget-boolean v0, v0, Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;->isCancel:Z

    if-eqz v0, :cond_2

    move v0, v1

    :goto_2
    invoke-static {v1, v2, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(ZLcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)Landroid/os/Bundle;

    move-result-object v0

    .line 196
    const-string/jumbo v2, "deepClean"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 197
    sget-object v1, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->RESULT_ACTION_SKIP_SUB_MODULE:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->b(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    goto :goto_0

    .line 163
    :pswitch_0
    iget v0, p1, Lcom/qihoo/security/ui/result/card/a;->a:I

    packed-switch v0, :pswitch_data_1

    goto :goto_1

    .line 165
    :pswitch_1
    const/16 v0, 0x4863

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_1

    .line 175
    :pswitch_2
    iget v0, p1, Lcom/qihoo/security/ui/result/card/a;->a:I

    packed-switch v0, :pswitch_data_2

    :pswitch_3
    goto :goto_1

    .line 183
    :pswitch_4
    const/16 v0, 0x4784

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_1

    .line 177
    :pswitch_5
    const/16 v0, 0x4783

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_1

    .line 194
    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    .line 161
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_0
    .end packed-switch

    .line 163
    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_1
    .end packed-switch

    .line 175
    :pswitch_data_2
    .packed-switch 0x4
        :pswitch_4
        :pswitch_3
        :pswitch_5
    .end packed-switch
.end method

.method protected d()V
    .locals 8

    .prologue
    const-wide/16 v6, 0x0

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 111
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->d:Landroid/content/Context;

    const-string/jumbo v1, "clean_trash_number"

    invoke-static {v0, v1, v6, v7}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    .line 115
    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->d:Landroid/content/Context;

    invoke-static {v2, v3, v0, v1, v3}, Lcom/qihoo360/mobilesafe/share/c;->a(Landroid/content/Context;IJI)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 116
    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->d:Landroid/content/Context;

    invoke-static {v2, v0, v1, v3}, Lcom/qihoo/security/opti/b/d;->a(Landroid/content/Context;JZ)Ljava/lang/String;

    move-result-object v0

    .line 117
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c00ca

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 118
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 119
    if-eqz v1, :cond_0

    .line 120
    invoke-static {v1, v0, v4}, Lcom/qihoo360/mobilesafe/share/c;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 123
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->d:Landroid/content/Context;

    const-string/jumbo v1, "clean_trash_number"

    invoke-static {v0, v1, v6, v7}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 124
    return-void
.end method

.method protected l()I
    .locals 2

    .prologue
    .line 128
    const/4 v0, 0x3

    .line 132
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->u:Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->u:Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;

    iget-boolean v1, v1, Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;->isDeepClean:Z

    if-eqz v1, :cond_0

    .line 133
    const/4 v0, 0x4

    .line 135
    :cond_0
    return v0
.end method

.method protected m()V
    .locals 2

    .prologue
    .line 144
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->u:Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->u:Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;->cleanSize:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 145
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->n:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->u:Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;

    iget-object v1, v1, Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;->cleanSize:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 146
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->o:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0055

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 152
    :goto_0
    return-void

    .line 148
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->n:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 149
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->o:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c004c

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto :goto_0
.end method

.method protected n()V
    .locals 0

    .prologue
    .line 140
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

    .line 73
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->onClick(Landroid/view/View;)V

    .line 74
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 92
    :goto_0
    return-void

    .line 76
    :sswitch_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->u:Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->u:Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;

    iget-boolean v0, v0, Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;->isDeepClean:Z

    if-eqz v0, :cond_0

    .line 77
    const/16 v0, 0x4866

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_0

    .line 79
    :cond_0
    const/16 v0, 0x478a

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    goto :goto_0

    .line 83
    :sswitch_1
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->u:Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->u:Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;

    iget-boolean v0, v0, Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;->isDeepClean:Z

    if-eqz v0, :cond_1

    .line 84
    const/16 v0, 0x4865

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto :goto_0

    .line 86
    :cond_1
    const/16 v0, 0x4789

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto :goto_0

    .line 74
    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0b009f -> :sswitch_0
        0x7f0b00f6 -> :sswitch_1
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 51
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->onCreate(Landroid/os/Bundle;)V

    .line 52
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->g:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->u:Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;

    .line 53
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 54
    const-string/jumbo v1, "color"

    sget-object v2, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 55
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->e:Lcom/qihoo/security/ui/fragment/BaseFragment$b;

    sget-object v2, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->CLEAN_ACTION_UPDATE_COLOR:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    invoke-interface {v1, v2, v0}, Lcom/qihoo/security/ui/fragment/BaseFragment$b;->a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    .line 56
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 60
    invoke-super {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->onResume()V

    .line 61
    const/16 v0, 0xb

    invoke-static {v0}, Lcom/qihoo/security/ui/b/b;->a(I)V

    .line 62
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->o()V

    .line 63
    invoke-static {}, Lcom/qihoo/security/recommend/RecommendHelper;->a()Lcom/qihoo/security/recommend/RecommendHelper;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Clean:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/recommend/RecommendHelper;->d(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V

    .line 64
    return-void
.end method

.method protected p()I
    .locals 1

    .prologue
    .line 95
    const/16 v0, 0xc

    return v0
.end method
