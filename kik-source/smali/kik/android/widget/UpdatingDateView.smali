.class public Lkik/android/widget/UpdatingDateView;
.super Landroid/widget/TextView;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:J

.field private final c:I

.field private final d:I

.field private e:Landroid/content/BroadcastReceiver;

.field private f:Landroid/database/ContentObserver;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    .line 42
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    const/4 v0, 0x1

    iput v0, p0, Lkik/android/widget/UpdatingDateView;->c:I

    .line 33
    const/4 v0, 0x2

    iput v0, p0, Lkik/android/widget/UpdatingDateView;->d:I

    .line 50
    new-instance v0, Lkik/android/widget/eh;

    invoke-direct {v0, p0}, Lkik/android/widget/eh;-><init>(Lkik/android/widget/UpdatingDateView;)V

    iput-object v0, p0, Lkik/android/widget/UpdatingDateView;->e:Landroid/content/BroadcastReceiver;

    .line 62
    new-instance v0, Lkik/android/widget/ei;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    invoke-direct {v0, p0, v1}, Lkik/android/widget/ei;-><init>(Lkik/android/widget/UpdatingDateView;Landroid/os/Handler;)V

    iput-object v0, p0, Lkik/android/widget/UpdatingDateView;->f:Landroid/database/ContentObserver;

    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 47
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    const/4 v0, 0x1

    iput v0, p0, Lkik/android/widget/UpdatingDateView;->c:I

    .line 33
    const/4 v0, 0x2

    iput v0, p0, Lkik/android/widget/UpdatingDateView;->d:I

    .line 50
    new-instance v0, Lkik/android/widget/eh;

    invoke-direct {v0, p0}, Lkik/android/widget/eh;-><init>(Lkik/android/widget/UpdatingDateView;)V

    iput-object v0, p0, Lkik/android/widget/UpdatingDateView;->e:Landroid/content/BroadcastReceiver;

    .line 62
    new-instance v0, Lkik/android/widget/ei;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    invoke-direct {v0, p0, v1}, Lkik/android/widget/ei;-><init>(Lkik/android/widget/UpdatingDateView;Landroid/os/Handler;)V

    iput-object v0, p0, Lkik/android/widget/UpdatingDateView;->f:Landroid/database/ContentObserver;

    .line 48
    return-void
.end method

.method static synthetic a(Lkik/android/widget/UpdatingDateView;)J
    .locals 2

    .prologue
    .line 19
    iget-wide v0, p0, Lkik/android/widget/UpdatingDateView;->a:J

    return-wide v0
.end method

.method static synthetic b(Lkik/android/widget/UpdatingDateView;)V
    .locals 14

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 19
    new-instance v0, Landroid/text/format/Time;

    invoke-direct {v0}, Landroid/text/format/Time;-><init>()V

    iget-wide v4, p0, Lkik/android/widget/UpdatingDateView;->b:J

    invoke-virtual {v0, v4, v5}, Landroid/text/format/Time;->set(J)V

    iget v1, v0, Landroid/text/format/Time;->hour:I

    add-int/lit8 v1, v1, -0xc

    iput v1, v0, Landroid/text/format/Time;->hour:I

    invoke-virtual {v0, v3}, Landroid/text/format/Time;->toMillis(Z)J

    move-result-wide v4

    iget v1, v0, Landroid/text/format/Time;->hour:I

    add-int/lit8 v1, v1, 0xc

    iput v1, v0, Landroid/text/format/Time;->hour:I

    invoke-virtual {v0, v3}, Landroid/text/format/Time;->toMillis(Z)J

    move-result-wide v6

    iput v3, v0, Landroid/text/format/Time;->hour:I

    iput v3, v0, Landroid/text/format/Time;->minute:I

    invoke-virtual {v0, v3}, Landroid/text/format/Time;->toMillis(Z)J

    move-result-wide v8

    iget v1, v0, Landroid/text/format/Time;->monthDay:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Landroid/text/format/Time;->monthDay:I

    invoke-virtual {v0, v3}, Landroid/text/format/Time;->toMillis(Z)J

    move-result-wide v10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    const/4 v0, 0x2

    cmp-long v1, v12, v8

    if-ltz v1, :cond_0

    cmp-long v1, v12, v10

    if-ltz v1, :cond_1

    :cond_0
    cmp-long v1, v12, v4

    if-ltz v1, :cond_6

    cmp-long v1, v12, v6

    if-gez v1, :cond_6

    :cond_1
    move v1, v2

    :goto_0
    packed-switch v1, :pswitch_data_0

    invoke-virtual {p0}, Lkik/android/widget/UpdatingDateView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v3, "date_format"

    invoke-static {v0, v3}, Landroid/provider/Settings$System;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v3, ""

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    :cond_2
    const-string v0, "m/d/y"

    iget-wide v4, p0, Lkik/android/widget/UpdatingDateView;->b:J

    invoke-static {v0, v4, v5}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;J)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {p0, v0}, Lkik/android/widget/UpdatingDateView;->setText(Ljava/lang/CharSequence;)V

    if-ne v1, v2, :cond_5

    invoke-static {v6, v7, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/widget/UpdatingDateView;->a:J

    :goto_2
    return-void

    :pswitch_0
    invoke-virtual {p0}, Lkik/android/widget/UpdatingDateView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "k:mm AA"

    iget-wide v4, p0, Lkik/android/widget/UpdatingDateView;->b:J

    invoke-static {v0, v4, v5}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;J)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    const-string v0, "h:mm AA"

    iget-wide v4, p0, Lkik/android/widget/UpdatingDateView;->b:J

    invoke-static {v0, v4, v5}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;J)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    :try_start_0
    iget-wide v4, p0, Lkik/android/widget/UpdatingDateView;->b:J

    invoke-static {v0, v4, v5}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;J)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v0, "m/d/y"

    iget-wide v4, p0, Lkik/android/widget/UpdatingDateView;->b:J

    invoke-static {v0, v4, v5}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;J)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_5
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lkik/android/widget/UpdatingDateView;->a:J

    goto :goto_2

    :cond_6
    move v1, v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .locals 4

    .prologue
    .line 73
    invoke-super {p0}, Landroid/widget/TextView;->onAttachedToWindow()V

    .line 74
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.DATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIME_SET"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIME_TICK"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.CONFIGURATION_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-virtual {p0}, Lkik/android/widget/UpdatingDateView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/UpdatingDateView;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const-string v0, "date_format"

    invoke-static {v0}, Landroid/provider/Settings$System;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/widget/UpdatingDateView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v2, 0x1

    iget-object v3, p0, Lkik/android/widget/UpdatingDateView;->f:Landroid/database/ContentObserver;

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 75
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    .line 80
    invoke-super {p0}, Landroid/widget/TextView;->onDetachedFromWindow()V

    .line 81
    invoke-virtual {p0}, Lkik/android/widget/UpdatingDateView;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/UpdatingDateView;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    invoke-virtual {p0}, Lkik/android/widget/UpdatingDateView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/UpdatingDateView;->f:Landroid/database/ContentObserver;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 82
    return-void
.end method
