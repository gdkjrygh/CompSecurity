.class public Lcom/EnterpriseMobileBanking/ContactUsHelper;
.super Ljava/lang/Object;
.source "ContactUsHelper.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "ContactUsHelper"

.field private static mInstance:Lcom/EnterpriseMobileBanking/ContactUsHelper;


# instance fields
.field private m360Email:Landroid/view/View;

.field private m360FB:Landroid/view/View;

.field private m360PhoneNum:Landroid/view/View;

.field private m360Twitter:Landroid/view/View;

.field private mActivity:Landroid/app/Activity;

.field private mCap1FB:Landroid/view/View;

.field private mCap1OutsideUs:Landroid/view/View;

.field private mCap1PhoneNum:Landroid/view/View;

.field private mCap1Twitter:Landroid/view/View;

.field private mCopyright:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/app/Activity;)V
    .locals 2
    .param p1, "a"    # Landroid/app/Activity;

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    .line 35
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    const v1, 0x7f08003b

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mCap1PhoneNum:Landroid/view/View;

    .line 36
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    const v1, 0x7f08003d

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mCap1OutsideUs:Landroid/view/View;

    .line 37
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    const v1, 0x7f080042

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mCap1Twitter:Landroid/view/View;

    .line 38
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    const v1, 0x7f080044

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mCap1FB:Landroid/view/View;

    .line 39
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    const v1, 0x7f080047

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->m360PhoneNum:Landroid/view/View;

    .line 40
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    const v1, 0x7f080049

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->m360Email:Landroid/view/View;

    .line 41
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    const v1, 0x7f08004b

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->m360Twitter:Landroid/view/View;

    .line 42
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    const v1, 0x7f08004d

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->m360FB:Landroid/view/View;

    .line 43
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    const v1, 0x7f08004e

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mCopyright:Landroid/view/View;

    .line 44
    return-void
.end method

.method public static getInstance(Landroid/app/Activity;)Lcom/EnterpriseMobileBanking/ContactUsHelper;
    .locals 1
    .param p0, "a"    # Landroid/app/Activity;

    .prologue
    .line 53
    sget-object v0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mInstance:Lcom/EnterpriseMobileBanking/ContactUsHelper;

    if-nez v0, :cond_0

    .line 54
    new-instance v0, Lcom/EnterpriseMobileBanking/ContactUsHelper;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/ContactUsHelper;-><init>(Landroid/app/Activity;)V

    sput-object v0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mInstance:Lcom/EnterpriseMobileBanking/ContactUsHelper;

    .line 55
    :cond_0
    sget-object v0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mInstance:Lcom/EnterpriseMobileBanking/ContactUsHelper;

    return-object v0
.end method


# virtual methods
.method public initContactUs()V
    .locals 10

    .prologue
    const v9, 0x7f08003c

    const v8, 0x7f090131

    const v7, 0x7f09012e

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 66
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 69
    .local v0, "r":Landroid/content/res/Resources;
    const-string v2, "SP_CONTACT_CAP1_US_PHONE"

    const v3, 0x7f0900e5

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 72
    .local v1, "str":Ljava/lang/String;
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    invoke-virtual {v2, v9}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0900b9

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v1, v4, v5

    invoke-static {v3, v4}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    invoke-virtual {v2, v9}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f09013f

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 80
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mCap1PhoneNum:Landroid/view/View;

    const v3, 0x7f0900ba

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v1, v4, v5

    invoke-static {v3, v4}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 84
    const-string v2, "SP_CONTACT_CAP1_NON_US_PHONE"

    const v3, 0x7f0900e6

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 87
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    const v3, 0x7f080040

    invoke-virtual {v2, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0900bc

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v1, v4, v5

    invoke-static {v3, v4}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    const v3, 0x7f080040

    invoke-virtual {v2, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f090140

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 96
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mCap1OutsideUs:Landroid/view/View;

    const v3, 0x7f0900bd

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v1, v4, v5

    invoke-static {v3, v4}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 100
    const-string v2, "SP_CONTACT_CAP1_TWITTER"

    const v3, 0x7f0900e7

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 102
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mCap1Twitter:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 103
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mCap1Twitter:Landroid/view/View;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f0900c2

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 109
    const-string v2, "SP_CONTACT_CAP1_FACEBOOK"

    const v3, 0x7f0900e8

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 111
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mCap1FB:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 112
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mCap1FB:Landroid/view/View;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f090143

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 118
    const-string v2, "SP_CONTACT_360_US_PHONE"

    const v3, 0x7f0900e9

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 120
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    const v3, 0x7f080048

    invoke-virtual {v2, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0900bf

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v1, v4, v5

    invoke-static {v3, v4}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    const v3, 0x7f080048

    invoke-virtual {v2, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f090141

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 128
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->m360PhoneNum:Landroid/view/View;

    const v3, 0x7f0900c0

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v1, v4, v5

    invoke-static {v3, v4}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 132
    const-string v2, "SP_CONTACT_360_EMAIL"

    const v3, 0x7f0900ea

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 134
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->m360Email:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 135
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->m360Email:Landroid/view/View;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f090142

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f09012f

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 141
    const-string v2, "SP_CONTACT_360_TWITTER"

    const v3, 0x7f0900eb

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 143
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->m360Twitter:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 144
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->m360Twitter:Landroid/view/View;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f0900c2

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 147
    const-string v2, "SP_CONTACT_360_FACEBOOK"

    const v3, 0x7f0900ec

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 149
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->m360FB:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 150
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->m360FB:Landroid/view/View;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f090143

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 154
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mCopyright:Landroid/view/View;

    check-cast v2, Landroid/widget/TextView;

    invoke-static {v2}, Lcom/EnterpriseMobileBanking/AppHelper;->setCopyrightYear(Landroid/widget/TextView;)V

    .line 155
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 5
    .param p1, "item"    # Landroid/view/MenuItem;

    .prologue
    const/4 v1, 0x1

    .line 176
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    .line 177
    .local v0, "id":I
    const-string v2, "ContactUsHelper"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "item id: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    packed-switch v0, :pswitch_data_0

    .line 194
    const/4 v1, 0x0

    :pswitch_0
    return v1

    .line 178
    :pswitch_data_0
    .packed-switch 0x7f0800ca
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)Z
    .locals 3
    .param p1, "menu"    # Landroid/view/ContextMenu;
    .param p2, "v"    # Landroid/view/View;
    .param p3, "menuInfo"    # Landroid/view/ContextMenu$ContextMenuInfo;

    .prologue
    .line 163
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v1

    .line 164
    .local v1, "vId":I
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mCap1PhoneNum:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 166
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/ContactUsHelper;->mActivity:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    .line 167
    .local v0, "inflater":Landroid/view/MenuInflater;
    const v2, 0x7f0e0001

    invoke-virtual {v0, v2, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 168
    const/4 v2, 0x1

    .line 171
    .end local v0    # "inflater":Landroid/view/MenuInflater;
    :goto_0
    return v2

    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method
