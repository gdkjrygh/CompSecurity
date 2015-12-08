.class public Lkik/android/chat/fragment/settings/PreferenceFragment;
.super Lkik/android/chat/fragment/KikIqFragmentBase;
.source "SourceFile"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceChangeListener;
.implements Lkik/android/chat/fragment/settings/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/settings/PreferenceFragment$a;
    }
.end annotation


# instance fields
.field private a:Landroid/preference/PreferenceManager;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/view/ViewGroup;

.field private d:Lkik/android/chat/fragment/settings/PreferenceFragment$a;

.field private e:Z

.field private f:Z

.field private g:Landroid/os/Handler;

.field private h:Landroid/widget/ListView;

.field protected i:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected j:Lkik/android/util/ar;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private k:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 96
    invoke-direct {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;-><init>()V

    .line 62
    new-instance v0, Lkik/android/chat/fragment/settings/PreferenceFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->d:Lkik/android/chat/fragment/settings/PreferenceFragment$a;

    .line 63
    iput-boolean v1, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->e:Z

    .line 64
    iput-boolean v1, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->f:Z

    .line 77
    new-instance v0, Lkik/android/chat/fragment/settings/e;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/settings/e;-><init>(Lkik/android/chat/fragment/settings/PreferenceFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->g:Landroid/os/Handler;

    .line 98
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 290
    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->g:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 295
    :goto_0
    return-void

    .line 293
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->g:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/chat/fragment/settings/PreferenceFragment;)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->d()V

    return-void
.end method

.method static synthetic b(Lkik/android/chat/fragment/settings/PreferenceFragment;)Z
    .locals 1

    .prologue
    .line 49
    iget-boolean v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->f:Z

    return v0
.end method

.method static synthetic c(Lkik/android/chat/fragment/settings/PreferenceFragment;)Landroid/view/ViewGroup;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->c:Landroid/view/ViewGroup;

    return-object v0
.end method

.method private d()V
    .locals 6

    .prologue
    .line 299
    invoke-direct {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->f()Landroid/preference/PreferenceScreen;

    move-result-object v3

    .line 300
    if-eqz v3, :cond_9

    .line 301
    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->b:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/preference/PreferenceScreen;->getTitle()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 302
    invoke-virtual {p0, v3}, Lkik/android/chat/fragment/settings/PreferenceFragment;->a(Landroid/preference/PreferenceScreen;)V

    .line 303
    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->h:Landroid/widget/ListView;

    invoke-virtual {v3, v0}, Landroid/preference/PreferenceScreen;->bind(Landroid/widget/ListView;)V

    .line 304
    invoke-virtual {v3}, Landroid/preference/PreferenceScreen;->getPreferenceCount()I

    move-result v4

    .line 305
    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-ge v2, v4, :cond_9

    .line 306
    invoke-virtual {v3, v2}, Landroid/preference/PreferenceScreen;->getPreference(I)Landroid/preference/Preference;

    move-result-object v1

    .line 307
    instance-of v0, v1, Lkik/android/widget/preferences/KikPreferenceScreen;

    if-eqz v0, :cond_2

    move-object v0, v1

    .line 308
    check-cast v0, Lkik/android/widget/preferences/KikPreferenceScreen;

    .line 309
    invoke-virtual {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->V()Lcom/kik/e/a;

    move-result-object v5

    invoke-interface {v5, v0}, Lcom/kik/e/a;->a(Lkik/android/widget/preferences/KikPreferenceScreen;)V

    .line 310
    new-instance v5, Lkik/android/chat/fragment/settings/g;

    invoke-direct {v5, p0, v0}, Lkik/android/chat/fragment/settings/g;-><init>(Lkik/android/chat/fragment/settings/PreferenceFragment;Lkik/android/widget/preferences/KikPreferenceScreen;)V

    invoke-virtual {v1, v5}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 321
    invoke-virtual {v0, p0}, Lkik/android/widget/preferences/KikPreferenceScreen;->a(Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    .line 356
    :cond_0
    :goto_1
    instance-of v0, v1, Lcom/kik/m/p;

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Landroid/preference/Preference;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Landroid/preference/Preference;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    iget-object v5, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->d:Lkik/android/chat/fragment/settings/PreferenceFragment$a;

    invoke-virtual {v5}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 357
    check-cast v1, Lcom/kik/m/p;

    const/4 v0, 0x1

    invoke-interface {v1, v0}, Lcom/kik/m/p;->a(Z)V

    .line 305
    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 323
    :cond_2
    instance-of v0, v1, Lkik/android/widget/preferences/KikVideoPrefetchPreference;

    if-eqz v0, :cond_3

    move-object v0, v1

    .line 324
    check-cast v0, Lkik/android/widget/preferences/KikVideoPrefetchPreference;

    .line 325
    invoke-virtual {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->V()Lcom/kik/e/a;

    move-result-object v5

    invoke-virtual {v0, v5}, Lkik/android/widget/preferences/KikVideoPrefetchPreference;->a(Lcom/kik/e/a;)V

    goto :goto_1

    .line 327
    :cond_3
    instance-of v0, v1, Lkik/android/widget/preferences/AutoplayVideoPreference;

    if-eqz v0, :cond_4

    move-object v0, v1

    .line 328
    check-cast v0, Lkik/android/widget/preferences/AutoplayVideoPreference;

    .line 329
    invoke-virtual {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->V()Lcom/kik/e/a;

    move-result-object v5

    invoke-virtual {v0, v5}, Lkik/android/widget/preferences/AutoplayVideoPreference;->a(Lcom/kik/e/a;)V

    goto :goto_1

    .line 331
    :cond_4
    instance-of v0, v1, Lkik/android/widget/preferences/LEDNotificationPreference;

    if-eqz v0, :cond_5

    move-object v0, v1

    .line 332
    check-cast v0, Lkik/android/widget/preferences/LEDNotificationPreference;

    .line 333
    invoke-virtual {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->V()Lcom/kik/e/a;

    move-result-object v5

    invoke-virtual {v0, v5}, Lkik/android/widget/preferences/LEDNotificationPreference;->a(Lcom/kik/e/a;)V

    goto :goto_1

    .line 335
    :cond_5
    instance-of v0, v1, Lkik/android/widget/preferences/KikEditTextPreference;

    if-eqz v0, :cond_6

    move-object v0, v1

    .line 336
    check-cast v0, Lkik/android/widget/preferences/KikEditTextPreference;

    .line 337
    invoke-virtual {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->V()Lcom/kik/e/a;

    move-result-object v5

    invoke-virtual {v0, v5}, Lkik/android/widget/preferences/KikEditTextPreference;->a(Lcom/kik/e/a;)V

    .line 338
    invoke-virtual {v0, p0}, Lkik/android/widget/preferences/KikEditTextPreference;->a(Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    goto :goto_1

    .line 340
    :cond_6
    instance-of v0, v1, Lkik/android/widget/preferences/KikCheckBoxPreference;

    if-eqz v0, :cond_7

    move-object v0, v1

    .line 341
    check-cast v0, Lkik/android/widget/preferences/KikCheckBoxPreference;

    .line 342
    invoke-virtual {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->V()Lcom/kik/e/a;

    move-result-object v5

    invoke-virtual {v0, v5}, Lkik/android/widget/preferences/KikCheckBoxPreference;->a(Lcom/kik/e/a;)V

    .line 343
    invoke-virtual {v0, p0}, Lkik/android/widget/preferences/KikCheckBoxPreference;->a(Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    goto :goto_1

    .line 345
    :cond_7
    instance-of v0, v1, Lkik/android/widget/preferences/KikModalPreference;

    if-eqz v0, :cond_8

    move-object v0, v1

    .line 346
    check-cast v0, Lkik/android/widget/preferences/KikModalPreference;

    .line 347
    invoke-virtual {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->V()Lcom/kik/e/a;

    move-result-object v5

    invoke-virtual {v0, v5}, Lkik/android/widget/preferences/KikModalPreference;->a(Lcom/kik/e/a;)V

    .line 348
    invoke-virtual {v0, p0}, Lkik/android/widget/preferences/KikModalPreference;->a(Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    goto/16 :goto_1

    .line 350
    :cond_8
    instance-of v0, v1, Lkik/android/widget/preferences/KikPreference;

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 351
    check-cast v0, Lkik/android/widget/preferences/KikPreference;

    .line 352
    invoke-virtual {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->V()Lcom/kik/e/a;

    move-result-object v5

    invoke-virtual {v0, v5}, Lkik/android/widget/preferences/KikPreference;->a(Lcom/kik/e/a;)V

    .line 353
    invoke-virtual {v0, p0}, Lkik/android/widget/preferences/KikPreference;->a(Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    goto/16 :goto_1

    .line 361
    :cond_9
    return-void
.end method

.method private e()Landroid/preference/PreferenceManager;
    .locals 4

    .prologue
    .line 380
    :try_start_0
    const-class v0, Landroid/preference/PreferenceManager;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Landroid/app/Activity;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 381
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 382
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/preference/PreferenceManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 387
    :goto_0
    return-object v0

    .line 385
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 387
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private f()Landroid/preference/PreferenceScreen;
    .locals 3

    .prologue
    .line 429
    :try_start_0
    const-class v0, Landroid/preference/PreferenceManager;

    const-string v1, "getPreferenceScreen"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 430
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 431
    iget-object v1, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->a:Landroid/preference/PreferenceManager;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/preference/PreferenceScreen;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 435
    :goto_0
    return-object v0

    .line 433
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 435
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected a(I)I
    .locals 0

    .prologue
    .line 131
    return p1
.end method

.method public final a(Ljava/lang/CharSequence;)Landroid/preference/Preference;
    .locals 1

    .prologue
    .line 477
    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->a:Landroid/preference/PreferenceManager;

    if-nez v0, :cond_0

    .line 478
    const/4 v0, 0x0

    .line 480
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->a:Landroid/preference/PreferenceManager;

    invoke-virtual {v0, p1}, Landroid/preference/PreferenceManager;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    goto :goto_0
.end method

.method protected a(Landroid/preference/PreferenceScreen;)V
    .locals 0

    .prologue
    .line 370
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 531
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->e:Z

    .line 532
    return-void
.end method

.method protected final c()Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->h:Landroid/widget/ListView;

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    .prologue
    .line 272
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikIqFragmentBase;->onActivityResult(IILandroid/content/Intent;)V

    .line 274
    :try_start_0
    const-class v0, Landroid/preference/PreferenceManager;

    const-string v1, "dispatchActivityResult"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v3

    const/4 v3, 0x2

    const-class v4, Landroid/content/Intent;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 275
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 276
    iget-object v1, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->a:Landroid/preference/PreferenceManager;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    aput-object p3, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 281
    :goto_0
    return-void

    .line 278
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 147
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 153
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 103
    invoke-direct {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->a()V

    .line 109
    invoke-virtual {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 110
    iget-object v1, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->d:Lkik/android/chat/fragment/settings/PreferenceFragment$a;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->a(Landroid/os/Bundle;)V

    .line 112
    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->d:Lkik/android/chat/fragment/settings/PreferenceFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->a(Lkik/android/chat/fragment/settings/PreferenceFragment$a;)I

    move-result v0

    .line 115
    iget-object v1, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->d:Lkik/android/chat/fragment/settings/PreferenceFragment$a;

    invoke-virtual {v1}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->b()I

    move-result v1

    .line 117
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->a(I)I

    move-result v2

    invoke-direct {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->e()Landroid/preference/PreferenceManager;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->a:Landroid/preference/PreferenceManager;

    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->a:Landroid/preference/PreferenceManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->a:Landroid/preference/PreferenceManager;

    iget-object v3, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->j:Lkik/android/util/ar;

    invoke-interface {v3}, Lkik/android/util/ar;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/preference/PreferenceManager;->setSharedPreferencesName(Ljava/lang/String;)V

    :cond_0
    const v0, 0x7f030048

    invoke-virtual {p1, v0, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    const v0, 0x7f0e004f

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const v0, 0x7f0e000e

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->c:Landroid/view/ViewGroup;

    if-eqz v1, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->c:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->c:Landroid/view/ViewGroup;

    invoke-virtual {p1, v1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    :cond_1
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    const v0, 0x102000a

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->h:Landroid/widget/ListView;

    const/16 v0, 0x9

    invoke-static {v0}, Lcom/kik/sdkutils/y;->b(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->h:Landroid/widget/ListView;

    invoke-virtual {v0, v8}, Landroid/widget/ListView;->setOverscrollFooter(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->h:Landroid/widget/ListView;

    invoke-virtual {v0, v6}, Landroid/widget/ListView;->setScrollBarStyle(I)V

    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->h:Landroid/widget/ListView;

    new-instance v1, Lkik/android/chat/fragment/settings/f;

    invoke-direct {v1, p0, v4}, Lkik/android/chat/fragment/settings/f;-><init>(Lkik/android/chat/fragment/settings/PreferenceFragment;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    const v0, 0x7f0e0078

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->b:Landroid/widget/TextView;

    :try_start_0
    const-class v0, Landroid/preference/PreferenceManager;

    const-string v1, "inflateFromResource"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Class;

    const/4 v5, 0x0

    const-class v6, Landroid/content/Context;

    aput-object v6, v4, v5

    const/4 v5, 0x1

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v6, v4, v5

    const/4 v5, 0x2

    const-class v6, Landroid/preference/PreferenceScreen;

    aput-object v6, v4, v5

    invoke-virtual {v0, v1, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    iget-object v1, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->a:Landroid/preference/PreferenceManager;

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x2

    invoke-direct {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->f()Landroid/preference/PreferenceScreen;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-virtual {v0, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/preference/PreferenceScreen;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-class v1, Landroid/preference/PreferenceManager;

    const-string v4, "setPreferences"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Class;

    const/4 v6, 0x0

    const-class v7, Landroid/preference/PreferenceScreen;

    aput-object v7, v5, v6

    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    iget-object v4, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->a:Landroid/preference/PreferenceManager;

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    invoke-virtual {v1, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->a()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_3
    :goto_1
    iput v2, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->k:I

    invoke-direct {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->d()V

    invoke-direct {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->f()Landroid/preference/PreferenceScreen;

    .line 119
    return-object v3

    .line 117
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->d:Lkik/android/chat/fragment/settings/PreferenceFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->c:Landroid/view/ViewGroup;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->c:Landroid/view/ViewGroup;

    invoke-virtual {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v5, 0x7f0c008b

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :cond_6
    iput-boolean v7, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->f:Z

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/view/View;->setAlpha(F)V

    goto/16 :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1
.end method

.method public onDestroy()V
    .locals 3

    .prologue
    .line 257
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onDestroy()V

    .line 258
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->h:Landroid/widget/ListView;

    .line 260
    :try_start_0
    const-class v0, Landroid/preference/PreferenceManager;

    const-string v1, "dispatchActivityDestroy"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 261
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 262
    iget-object v1, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->a:Landroid/preference/PreferenceManager;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 267
    :goto_0
    return-void

    .line 264
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public onDestroyView()V
    .locals 2

    .prologue
    .line 137
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onDestroyView()V

    .line 138
    iget-object v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->h:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 139
    if-eqz v0, :cond_0

    .line 140
    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->h:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 142
    :cond_0
    return-void
.end method

.method public onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 486
    const/4 v0, 0x0

    return v0
.end method

.method public onResume()V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 503
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onResume()V

    .line 504
    iget-boolean v0, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->e:Z

    if-eqz v0, :cond_2

    .line 505
    iput-boolean v2, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->e:Z

    .line 506
    iget-object v3, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->h:Landroid/widget/ListView;

    invoke-direct {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->f()Landroid/preference/PreferenceScreen;

    move-result-object v4

    move v1, v2

    :goto_0
    invoke-virtual {v4}, Landroid/preference/PreferenceScreen;->getPreferenceCount()I

    move-result v0

    if-ge v1, v0, :cond_1

    invoke-virtual {v4, v1}, Landroid/preference/PreferenceScreen;->getPreference(I)Landroid/preference/Preference;

    move-result-object v0

    instance-of v5, v0, Lcom/kik/m/p;

    if-eqz v5, :cond_0

    check-cast v0, Lcom/kik/m/p;

    invoke-interface {v0, v2}, Lcom/kik/m/p;->a(Z)V

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_1
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    const v4, 0x7f0e01be

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    const v5, 0x7f0e01bf

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v5, 0x2

    new-array v5, v5, [Landroid/view/View;

    aput-object v1, v5, v2

    const/4 v1, 0x1

    aput-object v4, v5, v1

    invoke-static {v5}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 508
    :cond_2
    return-void
.end method

.method public onStop()V
    .locals 3

    .prologue
    .line 243
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onStop()V

    .line 245
    :try_start_0
    const-class v0, Landroid/preference/PreferenceManager;

    const-string v1, "dispatchActivityStop"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 246
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 247
    iget-object v1, p0, Lkik/android/chat/fragment/settings/PreferenceFragment;->a:Landroid/preference/PreferenceManager;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 252
    :goto_0
    return-void

    .line 249
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
