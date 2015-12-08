.class public Lkik/android/chat/fragment/KikLoginFragment;
.super Lkik/android/chat/fragment/KikIqFragmentBase;
.source "SourceFile"


# instance fields
.field protected a:Lkik/a/f/k;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected b:Lkik/a/e/t;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected d:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected e:Lkik/a/e/f;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected f:Lkik/a/aa;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected g:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected h:Lcom/kik/l/ab;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected i:Lkik/android/util/ar;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field j:Landroid/text/TextWatcher;

.field private k:Landroid/widget/EditText;

.field private l:Landroid/widget/EditText;

.field private m:Landroid/content/res/Resources;

.field private n:Ljava/lang/String;

.field private o:Landroid/widget/Toast;

.field private p:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 55
    invoke-direct {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;-><init>()V

    .line 62
    const-string v0, ""

    iput-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->n:Ljava/lang/String;

    .line 76
    new-instance v0, Lkik/android/chat/fragment/md;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/md;-><init>(Lkik/android/chat/fragment/KikLoginFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->j:Landroid/text/TextWatcher;

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikLoginFragment;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->k:Landroid/widget/EditText;

    return-object v0
.end method

.method private a()V
    .locals 7

    .prologue
    .line 185
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->g:Lcom/kik/android/a;

    const-string v1, "Login Complete"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Attempts"

    invoke-virtual {v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;)Lcom/kik/android/a$f;

    .line 188
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->k:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 189
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->l:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 191
    const v1, 0x7f0901ee

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const v1, 0x7f0901e9

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 193
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->o:Landroid/widget/Toast;

    const v1, 0x7f0901bd

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(I)V

    .line 194
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->o:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 196
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->g:Lcom/kik/android/a;

    const-string v1, "Login Error"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 212
    :goto_0
    return-void

    .line 198
    :cond_0
    const v1, 0x7f0901ec

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 199
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->o:Landroid/widget/Toast;

    const v1, 0x7f0901bc

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 200
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->o:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 202
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->g:Lcom/kik/android/a;

    const-string v1, "Login Error"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_0

    .line 205
    :cond_1
    iget-object v1, p0, Lkik/android/chat/fragment/KikLoginFragment;->b:Lkik/a/e/t;

    invoke-interface {v1, v0}, Lkik/a/e/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->p:Ljava/lang/String;

    .line 206
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->p:Ljava/lang/String;

    const-string v1, "niCRwL7isZHny24qgLvy"

    invoke-static {v0, v2, v1}, Lkik/a/h/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v0

    .line 207
    invoke-static {v0}, Lkik/android/util/cq;->a([B)Ljava/lang/String;

    move-result-object v5

    .line 208
    new-instance v0, Lkik/a/f/f/ae;

    iget-object v3, p0, Lkik/android/chat/fragment/KikLoginFragment;->n:Ljava/lang/String;

    invoke-static {}, Lkik/android/chat/KikApplication;->b()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lkik/android/chat/fragment/KikLoginFragment;->k:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v6, p0, Lkik/android/chat/fragment/KikLoginFragment;->i:Lkik/android/util/ar;

    invoke-static {v1, v6}, Lkik/android/util/DeviceUtils;->a(Landroid/content/Context;Lkik/android/util/ar;)Ljava/util/Hashtable;

    move-result-object v6

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lkik/a/f/f/ae;-><init>(Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Hashtable;)V

    .line 209
    const v1, 0x7f090148

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikLoginFragment;->a(Lkik/a/f/f/y;Ljava/lang/String;Z)V

    .line 210
    const-string v0, ""

    iput-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->n:Ljava/lang/String;

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikLoginFragment;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 55
    if-nez p1, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->o:Landroid/widget/Toast;

    const v1, 0x7f090063

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->o:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "extra.resultUrl"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iput-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->n:Ljava/lang/String;

    invoke-direct {p0}, Lkik/android/chat/fragment/KikLoginFragment;->a()V

    goto :goto_0

    :cond_2
    const-string v0, "network"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->o:Landroid/widget/Toast;

    const v1, 0x7f09017a

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->o:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikLoginFragment;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->l:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikLoginFragment;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Lkik/android/chat/fragment/KikLoginFragment;->a()V

    return-void
.end method

.method static synthetic d(Lkik/android/chat/fragment/KikLoginFragment;)Landroid/widget/Toast;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->o:Landroid/widget/Toast;

    return-object v0
.end method


# virtual methods
.method protected final K()I
    .locals 1

    .prologue
    .line 383
    const v0, 0x7f0902d2

    return v0
.end method

.method protected final a(Lkik/a/f/f/z;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x0

    const/4 v5, 0x0

    .line 309
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->a(Lkik/a/f/f/z;)V

    .line 311
    check-cast p1, Lkik/a/f/f/ae;

    .line 313
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->c:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    .line 314
    invoke-virtual {p1}, Lkik/a/f/f/ae;->d()Lkik/a/d/aa;

    move-result-object v1

    .line 316
    iget-object v2, p0, Lkik/android/chat/fragment/KikLoginFragment;->k:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    .line 319
    iget-object v3, v1, Lkik/a/d/aa;->c:Ljava/lang/String;

    iput-object v3, v0, Lkik/a/d/aa;->c:Ljava/lang/String;

    .line 320
    iget-object v3, v1, Lkik/a/d/aa;->d:Ljava/lang/String;

    iput-object v3, v0, Lkik/a/d/aa;->d:Ljava/lang/String;

    .line 321
    iget-object v3, v1, Lkik/a/d/aa;->e:Ljava/lang/String;

    iput-object v3, v0, Lkik/a/d/aa;->e:Ljava/lang/String;

    .line 322
    iget-object v1, v1, Lkik/a/d/aa;->a:Ljava/lang/String;

    iput-object v1, v0, Lkik/a/d/aa;->a:Ljava/lang/String;

    .line 323
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lkik/a/d/aa;->g:Ljava/lang/Boolean;

    .line 325
    iget-object v1, p0, Lkik/android/chat/fragment/KikLoginFragment;->c:Lkik/a/e/w;

    invoke-interface {v1, v0}, Lkik/a/e/w;->a(Lkik/a/d/aa;)V

    .line 327
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->g:Lcom/kik/android/a;

    const-string v1, "Login Complete"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Attempts"

    invoke-virtual {v0, v1, v6, v7}, Lcom/kik/android/a$f;->b(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "By Username"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 333
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->g:Lcom/kik/android/a;

    invoke-virtual {v0}, Lcom/kik/android/a;->b()V

    .line 335
    new-instance v0, Lkik/a/d/j;

    invoke-virtual {p1}, Lkik/a/f/f/ae;->e()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lkik/android/chat/fragment/KikLoginFragment;->a:Lkik/a/f/k;

    invoke-interface {v3}, Lkik/a/f/k;->o()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v4}, Lkik/a/d/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    iget-object v1, p0, Lkik/android/chat/fragment/KikLoginFragment;->f:Lkik/a/aa;

    iget-object v3, p0, Lkik/android/chat/fragment/KikLoginFragment;->p:Ljava/lang/String;

    invoke-interface {v1, v0, v3}, Lkik/a/aa;->a(Lkik/a/d/j;Ljava/lang/String;)V

    .line 339
    iget-object v1, p0, Lkik/android/chat/fragment/KikLoginFragment;->g:Lcom/kik/android/a;

    const-string v3, "Logged In"

    invoke-virtual {v1, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v3, "Attempts"

    invoke-virtual {v1, v3, v6, v7}, Lcom/kik/android/a$f;->b(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v3, "By Username"

    invoke-virtual {v1, v3, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/android/a$f;->b()V

    .line 346
    iget-object v1, p0, Lkik/android/chat/fragment/KikLoginFragment;->k:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkik/android/widget/ce;->a(Landroid/content/Context;)V

    .line 351
    new-instance v1, Lkik/android/chat/fragment/mj;

    invoke-direct {v1, p0, v0}, Lkik/android/chat/fragment/mj;-><init>(Lkik/android/chat/fragment/KikLoginFragment;Lkik/a/d/j;)V

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikLoginFragment;->b(Ljava/lang/Runnable;)V

    .line 368
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->i:Lkik/android/util/ar;

    invoke-interface {v0}, Lkik/android/util/ar;->c()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 369
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "kik.install_count"

    const-string v3, "kik.install_count"

    invoke-interface {v0, v3, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 372
    return-void
.end method

.method protected final b(Lkik/a/f/f/z;)Z
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 223
    const v0, 0x7f0902d3

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->P:Ljava/lang/String;

    move-object v0, p1

    .line 225
    check-cast v0, Lkik/a/f/f/ae;

    .line 227
    invoke-virtual {v0}, Lkik/a/f/f/ae;->l()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 254
    invoke-virtual {v0}, Lkik/a/f/f/z;->l()I

    move-result v0

    invoke-static {v0}, Lkik/android/util/cy;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->Q:Ljava/lang/String;

    .line 258
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->g:Lcom/kik/android/a;

    const-string v1, "Login Error"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Error Code"

    invoke-virtual {p1}, Lkik/a/f/f/z;->l()I

    move-result v2

    int-to-long v4, v2

    invoke-virtual {v0, v1, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    move v0, v3

    .line 262
    :goto_1
    return v0

    .line 229
    :pswitch_0
    const v1, 0x7f0900d5

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lkik/a/f/f/ae;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v4, v2

    invoke-static {v1, v4}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->Q:Ljava/lang/String;

    goto :goto_0

    .line 232
    :pswitch_1
    const v1, 0x7f090354

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lkik/a/f/f/ae;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v4, v2

    invoke-static {v1, v4}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->Q:Ljava/lang/String;

    goto :goto_0

    .line 235
    :pswitch_2
    const v0, 0x7f090281

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->Q:Ljava/lang/String;

    goto :goto_0

    .line 238
    :pswitch_3
    const v0, 0x7f0900ae

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->Q:Ljava/lang/String;

    goto :goto_0

    :pswitch_4
    move-object v1, p1

    .line 241
    check-cast v1, Lkik/a/f/f/ae;

    invoke-virtual {v1}, Lkik/a/f/f/ae;->f()Ljava/lang/String;

    move-result-object v1

    .line 242
    if-eqz v1, :cond_0

    .line 243
    check-cast p1, Lkik/a/f/f/ae;

    invoke-virtual {p1}, Lkik/a/f/f/ae;->f()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/browser/CaptchaWindowFragment$c;

    invoke-direct {v1}, Lcom/kik/cards/browser/CaptchaWindowFragment$c;-><init>()V

    invoke-virtual {v1, v0}, Lcom/kik/cards/browser/CaptchaWindowFragment$c;->a(Ljava/lang/String;)Lcom/kik/cards/browser/CaptchaWindowFragment$c;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikLoginFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/mi;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/mi;-><init>(Lkik/android/chat/fragment/KikLoginFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    move v0, v2

    .line 244
    goto :goto_1

    .line 247
    :cond_0
    invoke-virtual {v0}, Lkik/a/f/f/z;->l()I

    move-result v0

    invoke-static {v0}, Lkik/android/util/cy;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->Q:Ljava/lang/String;

    goto/16 :goto_0

    .line 251
    :pswitch_5
    invoke-virtual {v0}, Lkik/a/f/f/ae;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->Q:Ljava/lang/String;

    goto/16 :goto_0

    .line 227
    nop

    :pswitch_data_0
    .packed-switch 0xc9
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 101
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 102
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikLoginFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikLoginFragment;)V

    .line 104
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikLoginFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, ""

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->o:Landroid/widget/Toast;

    .line 105
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->g:Lcom/kik/android/a;

    const-string v1, "Login Shown"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 106
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->d:Lkik/a/e/v;

    const-string v1, "ProfileManager.rosterTimeStamp"

    const-string v2, "0"

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->d:Lkik/a/e/v;

    const-string v1, "ProfileManager.rosterIsBatchedKey"

    const-string v2, "0"

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 107
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 112
    const v0, 0x7f03000f

    invoke-virtual {p1, v0, p2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 114
    const v0, 0x7f0e0064

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->k:Landroid/widget/EditText;

    .line 115
    const v0, 0x7f0e0065

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->l:Landroid/widget/EditText;

    .line 116
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->l:Landroid/widget/EditText;

    iget-object v2, p0, Lkik/android/chat/fragment/KikLoginFragment;->j:Landroid/text/TextWatcher;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 117
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->l:Landroid/widget/EditText;

    new-instance v2, Lkik/android/chat/fragment/me;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/me;-><init>(Lkik/android/chat/fragment/KikLoginFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 130
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->i:Lkik/android/util/ar;

    invoke-interface {v0}, Lkik/android/util/ar;->c()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v2, "usernameLogin"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 131
    if-eqz v0, :cond_0

    .line 132
    iget-object v2, p0, Lkik/android/chat/fragment/KikLoginFragment;->k:Landroid/widget/EditText;

    invoke-virtual {v2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 133
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->l:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 136
    :cond_0
    const v0, 0x7f0e001d

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lkik/android/chat/fragment/mf;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/mf;-><init>(Lkik/android/chat/fragment/KikLoginFragment;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 145
    iget-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->k:Landroid/widget/EditText;

    iget-object v2, p0, Lkik/android/chat/fragment/KikLoginFragment;->j:Landroid/text/TextWatcher;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 146
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikLoginFragment;->m:Landroid/content/res/Resources;

    .line 148
    const v0, 0x7f0e0066

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 149
    new-instance v2, Lkik/android/chat/fragment/mg;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/mg;-><init>(Lkik/android/chat/fragment/KikLoginFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    const v0, 0x7f0e0067

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lkik/android/chat/fragment/mh;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/mh;-><init>(Lkik/android/chat/fragment/KikLoginFragment;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 170
    const v0, 0x7f0e0068

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 172
    new-instance v2, Lkik/android/util/bg;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikLoginFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-direct {v2, v3}, Lkik/android/util/bg;-><init>(Landroid/content/Context;)V

    .line 173
    invoke-virtual {v2}, Lkik/android/util/bg;->a()Ljava/lang/String;

    move-result-object v2

    .line 174
    const v3, 0x7f090102

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v5

    invoke-static {v3, v4}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 178
    const/16 v2, 0xf

    invoke-static {v0, v2}, Landroid/text/util/Linkify;->addLinks(Landroid/widget/TextView;I)Z

    .line 179
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 180
    return-object v1
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 398
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onPause()V

    .line 399
    return-void
.end method

.method public onResume()V
    .locals 0

    .prologue
    .line 217
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onResume()V

    .line 218
    return-void
.end method
