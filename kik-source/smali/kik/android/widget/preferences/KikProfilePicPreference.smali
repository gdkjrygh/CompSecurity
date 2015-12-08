.class public Lkik/android/widget/preferences/KikProfilePicPreference;
.super Lkik/android/widget/preferences/KikPreference;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/preferences/KikProfilePicPreference$a;
    }
.end annotation


# static fields
.field private static final f:Lorg/c/b;


# instance fields
.field protected b:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected d:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field e:Landroid/widget/ImageView;

.field private g:Lkik/android/widget/preferences/KikProfilePicPreference$a;

.field private h:Lcom/kik/cache/ContactImageView;

.field private i:Lkik/android/widget/RobotoTextView;

.field private j:Lcom/kik/cache/SoftwareContactImageView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Lkik/a/d/aa;

.field private n:Lcom/kik/cache/ad;

.field private o:Landroid/view/View;

.field private p:Landroid/widget/Toast;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const-string v0, "KikProfilePicPreference"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/widget/preferences/KikProfilePicPreference;->f:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 63
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/preferences/KikProfilePicPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 64
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 68
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lkik/android/widget/preferences/KikPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V

    .line 69
    const v0, 0x7f030059

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/KikProfilePicPreference;->setLayoutResource(I)V

    .line 70
    return-void
.end method

.method static synthetic a(Lkik/android/widget/preferences/KikProfilePicPreference;)Landroid/widget/Toast;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->p:Landroid/widget/Toast;

    return-object v0
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 199
    iget-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->k:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 200
    if-nez p1, :cond_1

    .line 201
    iget-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->k:Landroid/widget/TextView;

    invoke-virtual {p0}, Lkik/android/widget/preferences/KikProfilePicPreference;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f090202

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 207
    :cond_0
    :goto_0
    return-void

    .line 204
    :cond_1
    iget-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->k:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/widget/preferences/KikProfilePicPreference;)Landroid/view/View;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->o:Landroid/view/View;

    return-object v0
.end method

.method static synthetic c(Lkik/android/widget/preferences/KikProfilePicPreference;)Lcom/kik/cache/ad;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->n:Lcom/kik/cache/ad;

    return-object v0
.end method

.method static synthetic d(Lkik/android/widget/preferences/KikProfilePicPreference;)Lkik/android/widget/preferences/KikProfilePicPreference$a;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->g:Lkik/android/widget/preferences/KikProfilePicPreference$a;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/kik/cache/ad;)V
    .locals 0

    .prologue
    .line 172
    iput-object p1, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->n:Lcom/kik/cache/ad;

    .line 173
    return-void
.end method

.method public final a(Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 75
    invoke-interface {p1, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/preferences/KikProfilePicPreference;)V

    .line 76
    return-void
.end method

.method public final a(Lkik/android/widget/preferences/KikProfilePicPreference$a;)V
    .locals 0

    .prologue
    .line 218
    iput-object p1, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->g:Lkik/android/widget/preferences/KikProfilePicPreference$a;

    .line 219
    return-void
.end method

.method public final d()V
    .locals 0

    .prologue
    .line 223
    invoke-virtual {p0}, Lkik/android/widget/preferences/KikProfilePicPreference;->notifyChanged()V

    .line 224
    return-void
.end method

.method protected onBindView(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 81
    invoke-super {p0, p1}, Lkik/android/widget/preferences/KikPreference;->onBindView(Landroid/view/View;)V

    .line 83
    const v0, 0x7f0e0030

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/SoftwareContactImageView;

    iput-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->j:Lcom/kik/cache/SoftwareContactImageView;

    .line 84
    const v0, 0x7f0e002f

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ContactImageView;

    iput-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->h:Lcom/kik/cache/ContactImageView;

    .line 85
    const v0, 0x7f0e0032

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->k:Landroid/widget/TextView;

    .line 86
    const v0, 0x7f0e0033

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->l:Landroid/widget/TextView;

    .line 87
    const v0, 0x7f0e0131

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->o:Landroid/view/View;

    .line 88
    const v0, 0x7f0e0133

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/RobotoTextView;

    iput-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->i:Lkik/android/widget/RobotoTextView;

    .line 89
    const v0, 0x7f0e0031

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->e:Landroid/widget/ImageView;

    .line 91
    invoke-virtual {p0}, Lkik/android/widget/preferences/KikProfilePicPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->p:Landroid/widget/Toast;

    .line 93
    iget-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->o:Landroid/view/View;

    new-instance v1, Lkik/android/widget/preferences/ad;

    invoke-direct {v1, p0}, Lkik/android/widget/preferences/ad;-><init>(Lkik/android/widget/preferences/KikProfilePicPreference;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    iget-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->j:Lcom/kik/cache/SoftwareContactImageView;

    new-instance v1, Lkik/android/widget/preferences/af;

    invoke-direct {v1, p0}, Lkik/android/widget/preferences/af;-><init>(Lkik/android/widget/preferences/KikProfilePicPreference;)V

    invoke-virtual {v0, v1}, Lcom/kik/cache/SoftwareContactImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 147
    iget-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->i:Lkik/android/widget/RobotoTextView;

    new-instance v1, Lkik/android/widget/preferences/ag;

    invoke-direct {v1, p0}, Lkik/android/widget/preferences/ag;-><init>(Lkik/android/widget/preferences/KikProfilePicPreference;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/RobotoTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 158
    iget-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->b:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    .line 160
    iget-object v1, v0, Lkik/a/d/aa;->i:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 161
    iget-object v1, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->e:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 167
    :goto_0
    iget-object v1, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->j:Lcom/kik/cache/SoftwareContactImageView;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->n:Lcom/kik/cache/ad;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->j:Lcom/kik/cache/SoftwareContactImageView;

    iget-object v2, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->n:Lcom/kik/cache/ad;

    invoke-virtual {v1, v0, v2}, Lcom/kik/cache/SoftwareContactImageView;->a(Lkik/a/d/aa;Lcom/kik/cache/ad;)V

    iget-object v1, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->h:Lcom/kik/cache/ContactImageView;

    iget-object v2, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->n:Lcom/kik/cache/ad;

    invoke-virtual {v1, v0, v2}, Lcom/kik/cache/ContactImageView;->b(Lkik/a/d/aa;Lcom/kik/cache/ad;)V

    :cond_0
    iput-object v0, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->m:Lkik/a/d/aa;

    iget-object v1, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->m:Lkik/a/d/aa;

    if-eqz v1, :cond_2

    iget-object v1, v0, Lkik/a/d/aa;->d:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lkik/a/d/aa;->e:Ljava/lang/String;

    if-nez v1, :cond_4

    :cond_1
    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lkik/android/widget/preferences/KikProfilePicPreference;->a(Ljava/lang/String;)V

    :goto_1
    iget-object v0, v0, Lkik/a/d/aa;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->l:Landroid/widget/TextView;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->l:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 168
    :cond_2
    return-void

    .line 164
    :cond_3
    iget-object v1, p0, Lkik/android/widget/preferences/KikProfilePicPreference;->e:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 167
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v0, Lkik/a/d/aa;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v0, Lkik/a/d/aa;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lkik/android/widget/preferences/KikProfilePicPreference;->a(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 1

    .prologue
    .line 229
    const/4 v0, 0x0

    return v0
.end method
