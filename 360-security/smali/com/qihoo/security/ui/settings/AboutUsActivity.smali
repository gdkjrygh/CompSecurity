.class public Lcom/qihoo/security/ui/settings/AboutUsActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation runtime Lcom/qihoo/security/support/ScreenAnalytics;
.end annotation


# instance fields
.field private A:Landroid/widget/LinearLayout;

.field private B:Landroid/widget/LinearLayout;

.field private C:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private D:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private E:Ljava/lang/String;

.field private final F:Ljava/lang/String;

.field private final G:Ljava/lang/String;

.field private final H:Ljava/lang/String;

.field private I:Z

.field private final J:Landroid/os/Handler;

.field private y:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private z:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 44
    const-string/jumbo v0, "Msupport@360safe.com"

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->F:Ljava/lang/String;

    .line 45
    const-string/jumbo v0, "http://360safe.com/mobile-security.html"

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->G:Ljava/lang/String;

    .line 46
    const-string/jumbo v0, "http://m.facebook.com/360safecenter"

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->H:Ljava/lang/String;

    .line 47
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->I:Z

    .line 49
    new-instance v0, Lcom/qihoo/security/ui/settings/AboutUsActivity$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/settings/AboutUsActivity$1;-><init>(Lcom/qihoo/security/ui/settings/AboutUsActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->J:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/settings/AboutUsActivity;Z)Z
    .locals 0

    .prologue
    .line 33
    iput-boolean p1, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->I:Z

    return p1
.end method

.method private o()V
    .locals 7

    .prologue
    .line 221
    const/4 v0, 0x1

    :try_start_0
    new-array v1, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string/jumbo v2, "Msupport@360safe.com"

    aput-object v2, v1, v0

    .line 222
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 223
    const-string/jumbo v2, "android.intent.action.SEND"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 224
    const-string/jumbo v2, "plain/text"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 225
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 226
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    .line 227
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 229
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 230
    new-instance v4, Landroid/content/Intent;

    const-string/jumbo v5, "android.intent.action.SEND"

    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 231
    const-string/jumbo v5, "text/plain"

    invoke-virtual {v4, v5}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 232
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 237
    iget-object v5, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    const-string/jumbo v6, "bluetooth"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    iget-object v5, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    const-string/jumbo v6, "huawei.hidisk"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 241
    const-string/jumbo v5, "android.intent.extra.EMAIL"

    invoke-virtual {v4, v5, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 242
    const-string/jumbo v5, "android.intent.extra.SUBJECT"

    iget-object v6, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->E:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 243
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 244
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 270
    :catch_0
    move-exception v0

    .line 275
    :goto_1
    return-void

    .line 246
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 247
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c016c

    const v2, 0x7f020143

    invoke-virtual {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/q;->a(II)V

    goto :goto_1

    .line 251
    :cond_2
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c016b

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v1

    .line 253
    if-nez v1, :cond_3

    .line 254
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c016c

    const v2, 0x7f020143

    invoke-virtual {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/q;->a(II)V

    goto :goto_1

    .line 258
    :cond_3
    const-string/jumbo v3, "android.intent.extra.INITIAL_INTENTS"

    const/4 v0, 0x0

    new-array v0, v0, [Landroid/os/Parcelable;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/os/Parcelable;

    invoke-virtual {v1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 260
    :try_start_1
    invoke-virtual {p0, v1}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 261
    :catch_1
    move-exception v0

    goto :goto_1

    .line 267
    :cond_4
    :try_start_2
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c016c

    const v2, 0x7f020143

    invoke-virtual {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/q;->a(II)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1
.end method

.method private p()V
    .locals 4

    .prologue
    .line 278
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->J:Landroid/os/Handler;

    const/4 v1, 0x0

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 279
    return-void
.end method


# virtual methods
.method protected j()V
    .locals 2

    .prologue
    .line 101
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 102
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 103
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0165

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->b(Ljava/lang/String;)V

    .line 105
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const v3, 0x7f0c0171

    const/4 v1, 0x1

    .line 109
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 205
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 111
    :pswitch_1
    iget-boolean v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->I:Z

    if-nez v0, :cond_0

    .line 112
    iput-boolean v1, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->I:Z

    .line 113
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->p()V

    .line 115
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "android.intent.action.VIEW"

    const-string/jumbo v2, "http://360safe.com/mobile-security.html"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 116
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 117
    :catch_0
    move-exception v0

    .line 121
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto :goto_0

    .line 127
    :pswitch_2
    iget-boolean v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->I:Z

    if-nez v0, :cond_0

    .line 128
    iput-boolean v1, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->I:Z

    .line 129
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->p()V

    .line 131
    :try_start_1
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "android.intent.action.VIEW"

    const-string/jumbo v2, "http://m.facebook.com/360safecenter"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 132
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 133
    :catch_1
    move-exception v0

    .line 137
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto :goto_0

    .line 142
    :pswitch_3
    iget-boolean v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->I:Z

    if-nez v0, :cond_0

    .line 143
    iput-boolean v1, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->I:Z

    .line 144
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->p()V

    .line 145
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->o()V

    goto :goto_0

    .line 149
    :pswitch_4
    iget-boolean v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->I:Z

    if-nez v0, :cond_0

    .line 150
    iput-boolean v1, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->I:Z

    .line 151
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->p()V

    .line 152
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/qihoo/security/lite/BrowserActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 153
    const-string/jumbo v1, "webdata"

    const v2, 0x7f060001

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 155
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 159
    :pswitch_5
    iget-boolean v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->I:Z

    if-nez v0, :cond_0

    .line 160
    iput-boolean v1, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->I:Z

    .line 161
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->p()V

    .line 173
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 175
    :try_start_2
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/qihoo/security/lite/BrowserActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 176
    const-string/jumbo v1, "webdata"

    const/high16 v2, 0x7f060000

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 177
    const-string/jumbo v1, "title"

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v2

    const v3, 0x7f0c01d3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 179
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_0

    .line 180
    :catch_2
    move-exception v0

    goto/16 :goto_0

    .line 109
    nop

    :pswitch_data_0
    .packed-switch 0x7f0b005e
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    .line 65
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 66
    const v0, 0x7f030019

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->setContentView(I)V

    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->o:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c01d2

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "1.0.8"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "3742"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "Feedback"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->E:Ljava/lang/String;

    .line 70
    const v0, 0x7f0b005c

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->y:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 75
    const v0, 0x7f0b005e

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->z:Landroid/widget/LinearLayout;

    .line 76
    const v0, 0x7f0b0060

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->A:Landroid/widget/LinearLayout;

    .line 77
    const v0, 0x7f0b0062

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->B:Landroid/widget/LinearLayout;

    .line 79
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->y:Lcom/qihoo/security/locale/widget/LocaleTextView;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "v"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, "1.0.8"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "3742"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 81
    const v0, 0x7f0b0064

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->C:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->C:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/text/TextPaint;->setFlags(I)V

    .line 83
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->C:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    const v0, 0x7f0b0065

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/AboutUsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->D:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 85
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->D:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/text/TextPaint;->setFlags(I)V

    .line 86
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->D:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->z:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 95
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->A:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/AboutUsActivity;->B:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    return-void
.end method
