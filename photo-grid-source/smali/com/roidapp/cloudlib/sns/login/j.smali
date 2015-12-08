.class public final Lcom/roidapp/cloudlib/sns/login/j;
.super Lcom/roidapp/cloudlib/sns/main/b;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/main/b;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/login/j;
    .locals 1

    .prologue
    .line 36
    new-instance v0, Lcom/roidapp/cloudlib/sns/login/j;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/login/j;-><init>()V

    .line 37
    iput-object p0, v0, Lcom/roidapp/cloudlib/sns/login/j;->a:Ljava/lang/String;

    .line 38
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/view/View;
    .locals 2

    .prologue
    .line 51
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/j;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/j;->a:Ljava/lang/String;

    const-string v1, "Notification_Login_Page"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 52
    new-instance v0, Lcom/roidapp/cloudlib/sns/ab;

    invoke-direct {v0, p1}, Lcom/roidapp/cloudlib/sns/ab;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/login/j;->t:Lcom/roidapp/cloudlib/sns/ab;

    .line 53
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/j;->t:Lcom/roidapp/cloudlib/sns/ab;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/j;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Landroid/view/View$OnClickListener;)V

    .line 54
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/j;->t:Lcom/roidapp/cloudlib/sns/ab;

    const-string v1, "Notification"

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/CharSequence;)V

    .line 55
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/j;->t:Lcom/roidapp/cloudlib/sns/ab;

    .line 57
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Z
    .locals 2

    .prologue
    .line 120
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/j;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/j;->a:Ljava/lang/String;

    const-string v1, "Notification_Login_Page"

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 111
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/j;->s:Lcom/roidapp/cloudlib/sns/main/a;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/j;->s()Z

    move-result v0

    if-nez v0, :cond_0

    .line 113
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/j;->a:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/app/Activity;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/j;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->i()V

    .line 117
    :cond_0
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .prologue
    const/4 v4, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 43
    sget v0, Lcom/roidapp/cloudlib/as;->k:I

    invoke-virtual {p1, v0, p2, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 1061
    sget v0, Lcom/roidapp/cloudlib/ar;->x:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 1062
    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 1063
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/j;->t()I

    move-result v3

    iput v3, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 1064
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1065
    sget v1, Lcom/roidapp/cloudlib/ar;->B:I

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/login/j;->b:Landroid/widget/TextView;

    .line 1066
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/j;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 1067
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/j;->a:Ljava/lang/String;

    const-string v3, "Notification_Login_Page"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1069
    :try_start_0
    sget v1, Lcom/roidapp/cloudlib/aq;->D:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 1073
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/j;->b:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->bv:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1084
    :cond_0
    :goto_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/j;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v1

    .line 1085
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/j;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v3, 0x41200000    # 10.0f

    invoke-static {v0, v3}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v3

    .line 1087
    sget v0, Lcom/roidapp/cloudlib/ar;->A:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1088
    sget v4, Lcom/roidapp/cloudlib/aq;->W:I

    invoke-static {v0, v4, v8, v8}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 1089
    const v4, -0xbb7335

    const v5, -0xc37f45

    invoke-static {v4, v5, v1, v3}, Lcom/roidapp/baselib/c/n;->a(IIII)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1090
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    sget v5, Lcom/roidapp/cloudlib/at;->aa:I

    invoke-virtual {p0, v5}, Lcom/roidapp/cloudlib/sns/login/j;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-array v6, v9, [Ljava/lang/Object;

    const-string v7, "INSTAGRAM"

    aput-object v7, v6, v8

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1091
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1093
    sget v0, Lcom/roidapp/cloudlib/ar;->y:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1094
    sget v4, Lcom/roidapp/cloudlib/aq;->U:I

    invoke-static {v0, v4, v8, v8}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 1095
    const v4, -0xc5a86a

    const v5, -0xd5bd89

    invoke-static {v4, v5, v1, v3}, Lcom/roidapp/baselib/c/n;->a(IIII)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1096
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    sget v5, Lcom/roidapp/cloudlib/at;->aa:I

    invoke-virtual {p0, v5}, Lcom/roidapp/cloudlib/sns/login/j;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-array v6, v9, [Ljava/lang/Object;

    const-string v7, "FACEBOOK"

    aput-object v7, v6, v8

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1097
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1099
    sget v0, Lcom/roidapp/cloudlib/ar;->z:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1100
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v4

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/roidapp/cloudlib/al;->e(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1101
    sget v4, Lcom/roidapp/cloudlib/aq;->V:I

    invoke-static {v0, v4, v8, v8}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 1102
    const v4, -0x17b9c7

    const v5, -0x2bc2cf

    invoke-static {v4, v5, v1, v3}, Lcom/roidapp/baselib/c/n;->a(IIII)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1103
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    sget v3, Lcom/roidapp/cloudlib/at;->aa:I

    invoke-virtual {p0, v3}, Lcom/roidapp/cloudlib/sns/login/j;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-array v4, v9, [Ljava/lang/Object;

    const-string v5, "GOOGLE"

    aput-object v5, v4, v8

    invoke-static {v1, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1104
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    :goto_2
    invoke-static {}, Lcom/roidapp/cloudlib/sns/f/a;->a()Lcom/roidapp/cloudlib/sns/f/a;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/j;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v9}, Lcom/roidapp/cloudlib/sns/f/a;->a(Ljava/lang/String;I)V

    .line 46
    return-object v2

    .line 1071
    :catch_0
    move-exception v1

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_0

    .line 1074
    :cond_1
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/j;->a:Ljava/lang/String;

    const-string v3, "Myprofile_Login_Page"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1076
    :try_start_1
    sget v1, Lcom/roidapp/cloudlib/aq;->F:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    .line 1080
    :goto_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/j;->b:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->bw:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_1

    .line 1078
    :catch_1
    move-exception v1

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_3

    .line 1106
    :cond_2
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2
.end method
