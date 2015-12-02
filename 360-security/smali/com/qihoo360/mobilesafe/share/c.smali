.class public Lcom/qihoo360/mobilesafe/share/c;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 41
    const-string/jumbo v0, "key_rating_lastest_show_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {p0, v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 42
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x2

    const/4 v4, 0x1

    .line 98
    if-nez p2, :cond_1

    .line 99
    const/16 v0, 0x4281

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 105
    :cond_0
    :goto_0
    new-instance v0, Lcom/qihoo/security/dialog/h;

    invoke-direct {v0, p0}, Lcom/qihoo/security/dialog/h;-><init>(Landroid/content/Context;)V

    .line 106
    invoke-virtual {v0, p1}, Lcom/qihoo/security/dialog/h;->a(Ljava/lang/String;)V

    .line 107
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c00cc

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 108
    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/h;->b(Ljava/lang/String;)V

    .line 109
    new-array v1, v5, [Ljava/lang/CharSequence;

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v2

    const v3, 0x7f0c00ce

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v6

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v2

    const v3, 0x7f0c00cd

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/h;->setButtonText([Ljava/lang/CharSequence;)V

    .line 111
    invoke-virtual {v0, v4}, Lcom/qihoo/security/dialog/h;->setCancelable(Z)V

    .line 112
    new-instance v1, Lcom/qihoo360/mobilesafe/share/c$1;

    invoke-direct {v1, v0}, Lcom/qihoo360/mobilesafe/share/c$1;-><init>(Lcom/qihoo/security/dialog/h;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/h;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 120
    new-array v1, v5, [Landroid/view/View$OnClickListener;

    new-instance v2, Lcom/qihoo360/mobilesafe/share/c$2;

    invoke-direct {v2, p0, v0, p2}, Lcom/qihoo360/mobilesafe/share/c$2;-><init>(Landroid/content/Context;Lcom/qihoo/security/dialog/h;I)V

    aput-object v2, v1, v6

    new-instance v2, Lcom/qihoo360/mobilesafe/share/c$3;

    invoke-direct {v2, v0}, Lcom/qihoo360/mobilesafe/share/c$3;-><init>(Lcom/qihoo/security/dialog/h;)V

    aput-object v2, v1, v4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/h;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 141
    invoke-virtual {v0}, Lcom/qihoo/security/dialog/h;->show()V

    .line 142
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/share/c;->a(Landroid/content/Context;)V

    .line 143
    return-void

    .line 100
    :cond_1
    if-ne p2, v4, :cond_2

    .line 101
    const/16 v0, 0x4269

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    goto :goto_0

    .line 102
    :cond_2
    if-ne p2, v5, :cond_0

    .line 103
    const/16 v0, 0x426a

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;IJI)Z
    .locals 8

    .prologue
    const-wide/16 v4, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 73
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/share/c;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 74
    const/16 v0, 0x14

    if-lt p1, v0, :cond_3

    .line 75
    const-string/jumbo v0, "the_last_start_app_time"

    invoke-static {p0, v0, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 76
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    sub-long/2addr v4, v6

    const-wide/32 v6, 0x240c8400

    cmp-long v0, v4, v6

    if-gtz v0, :cond_1

    move v0, v1

    .line 77
    :goto_0
    const-string/jumbo v3, "the_first_start_app"

    invoke-static {p0, v3, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v3

    .line 81
    if-eqz v0, :cond_2

    if-nez v3, :cond_2

    .line 94
    :cond_0
    :goto_1
    return v1

    :cond_1
    move v0, v2

    .line 76
    goto :goto_0

    :cond_2
    move v1, v2

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    cmp-long v0, p2, v4

    if-eqz v0, :cond_4

    .line 86
    const-wide/32 v4, 0x6400000

    cmp-long v0, p2, v4

    if-gez v0, :cond_0

    move v1, v2

    goto :goto_1

    .line 87
    :cond_4
    if-eqz p4, :cond_5

    .line 91
    if-ge p4, v1, :cond_0

    move v1, v2

    goto :goto_1

    :cond_5
    move v1, v2

    .line 94
    goto :goto_1
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 10

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 53
    const-string/jumbo v2, "com.android.vending"

    invoke-static {p0, v2}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    .line 54
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/b/o;->d(Landroid/content/Context;)Z

    move-result v4

    .line 55
    const-string/jumbo v2, "is_click_rating_dialog"

    invoke-static {p0, v2, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v5

    .line 56
    const-string/jumbo v2, "key_rating_lastest_show_time"

    const-wide/16 v6, 0x0

    invoke-static {p0, v2, v6, v7}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v6

    .line 57
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long v6, v8, v6

    const-wide/32 v8, 0x48190800

    cmp-long v2, v6, v8

    if-ltz v2, :cond_0

    move v2, v0

    .line 61
    :goto_0
    if-eqz v3, :cond_1

    if-eqz v4, :cond_1

    if-nez v5, :cond_1

    if-eqz v2, :cond_1

    :goto_1
    return v0

    :cond_0
    move v2, v1

    .line 57
    goto :goto_0

    :cond_1
    move v0, v1

    .line 61
    goto :goto_1
.end method
