.class public Lcom/qihoo/utils/notice/c;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/utils/notice/c$1;
    }
.end annotation


# static fields
.field private static a:Lcom/qihoo/utils/notice/c;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    return-void
.end method

.method public static a()Lcom/qihoo/utils/notice/c;
    .locals 1

    .prologue
    .line 99
    sget-object v0, Lcom/qihoo/utils/notice/c;->a:Lcom/qihoo/utils/notice/c;

    if-nez v0, :cond_0

    .line 100
    new-instance v0, Lcom/qihoo/utils/notice/c;

    invoke-direct {v0}, Lcom/qihoo/utils/notice/c;-><init>()V

    sput-object v0, Lcom/qihoo/utils/notice/c;->a:Lcom/qihoo/utils/notice/c;

    .line 102
    :cond_0
    sget-object v0, Lcom/qihoo/utils/notice/c;->a:Lcom/qihoo/utils/notice/c;

    return-object v0
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 172
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 173
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_MALWARE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 175
    const-string/jumbo v0, "size"

    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 176
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 177
    const/16 v1, 0x714b

    int-to-long v2, v0

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    .line 285
    :cond_0
    :goto_0
    return-void

    .line 179
    :cond_1
    const/16 v1, 0x4e27

    int-to-long v2, v0

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto :goto_0

    .line 181
    :cond_2
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_RISKY_APP"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 183
    const-string/jumbo v0, "size"

    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 184
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 185
    const/16 v1, 0x714d

    int-to-long v2, v0

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto :goto_0

    .line 187
    :cond_3
    const/16 v1, 0x4e28

    int-to-long v2, v0

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto :goto_0

    .line 189
    :cond_4
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_SAFE_APP"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 190
    const-string/jumbo v0, "pkg_name"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 192
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 193
    const/16 v1, 0x714f

    const-string/jumbo v2, ""

    invoke-static {v1, v0, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 195
    :cond_5
    const/16 v1, 0x4e29

    const-string/jumbo v2, ""

    invoke-static {v1, v0, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 197
    :cond_6
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_ANTIVIRUS_UPGRADE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 199
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 200
    const/16 v0, 0x7151

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_0

    .line 202
    :cond_7
    const/16 v0, 0x4e2a

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_0

    .line 204
    :cond_8
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_AUTO_START"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 205
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->c(Landroid/content/Context;)V

    .line 207
    const-string/jumbo v0, "size"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 208
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 209
    const/16 v1, 0x7157

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 212
    :cond_9
    const/16 v1, 0x4e2d

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 215
    :cond_a
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_CLEAN"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 217
    const-string/jumbo v0, "do_scan_size"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 218
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 219
    const/16 v1, 0x7153

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 222
    :cond_b
    const/16 v1, 0x4e2b

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 225
    :cond_c
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_BOOST"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 226
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->c(Landroid/content/Context;)V

    .line 228
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 229
    const/16 v0, 0x7155

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 231
    :cond_d
    const/16 v0, 0x4e2c

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 233
    :cond_e
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_ADV_APP"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 235
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 236
    const/16 v0, 0x7159

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 238
    :cond_f
    const/16 v0, 0x4e2e

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 240
    :cond_10
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_WEEKLY_CLEAN_TIP"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 242
    const/16 v0, 0x4e2f

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto/16 :goto_0

    .line 243
    :cond_11
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_BATTERY_LOW"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    .line 244
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->c(Landroid/content/Context;)V

    .line 246
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 247
    const/16 v0, 0x715b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 250
    :cond_12
    const/16 v0, 0x4e30

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 253
    :cond_13
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_BATTERY_LOW_POWER_REMIND"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    .line 254
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->c(Landroid/content/Context;)V

    .line 256
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 257
    const/16 v0, 0x715d

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 260
    :cond_14
    const/16 v0, 0x4e31

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 263
    :cond_15
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_POWER_REMIND"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    .line 264
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->c(Landroid/content/Context;)V

    .line 266
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 267
    const/16 v0, 0x715f

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 270
    :cond_16
    const/16 v0, 0x4e32

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 273
    :cond_17
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_BOOST_ACTIVE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 274
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->c(Landroid/content/Context;)V

    .line 276
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 277
    const/16 v0, 0x7165

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 280
    :cond_18
    const/16 v0, 0x4e47

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public static a(Landroid/content/Context;Z)V
    .locals 1

    .prologue
    .line 288
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;ZZ)V

    .line 289
    return-void
.end method

.method public static a(Landroid/content/Context;ZZ)V
    .locals 1

    .prologue
    .line 298
    const-string/jumbo v0, "sp_key_process_is_daemon"

    invoke-static {p0, v0, p1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 299
    invoke-static {p1}, Lcom/qihoo/security/app/DaemonMain;->a(Z)V

    .line 300
    return-void
.end method

.method private static a(J)Z
    .locals 4

    .prologue
    .line 490
    new-instance v0, Landroid/text/format/Time;

    invoke-direct {v0}, Landroid/text/format/Time;-><init>()V

    .line 491
    invoke-virtual {v0, p0, p1}, Landroid/text/format/Time;->set(J)V

    .line 492
    invoke-static {p0, p1}, Landroid/text/format/DateUtils;->isToday(J)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, v0, Landroid/text/format/Time;->hour:I

    const/16 v2, 0x8

    if-lt v1, v2, :cond_0

    iget v0, v0, Landroid/text/format/Time;->hour:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 493
    const/4 v0, 0x1

    .line 495
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 309
    const-string/jumbo v0, "sp_key_process_is_daemon"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static a(Landroid/content/Context;I)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 390
    invoke-static {p0, p1}, Lcom/qihoo/utils/notice/c;->c(Landroid/content/Context;I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 413
    :cond_0
    :goto_0
    return v0

    .line 396
    :cond_1
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->d(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 402
    invoke-static {p0}, Lcom/qihoo/utils/notice/c;->e(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 413
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;I)V
    .locals 4

    .prologue
    .line 443
    const-string/jumbo v0, "key_notice_push_one_day"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {p0, v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 444
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "key_notice_boost_show_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {p0, v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 445
    return-void
.end method

.method public static b()Z
    .locals 2

    .prologue
    .line 110
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x14

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 320
    const-string/jumbo v0, "setting_app_security_alert"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static c()V
    .locals 2

    .prologue
    .line 329
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1001

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 330
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1003

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 331
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1002

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 332
    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 480
    const-string/jumbo v0, "key_notice_boost_click_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {p0, v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 481
    return-void
.end method

.method private static c(Landroid/content/Context;I)Z
    .locals 4

    .prologue
    .line 457
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "key_notice_boost_show_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-wide/16 v2, 0x0

    invoke-static {p0, v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    .line 458
    invoke-static {v0, v1}, Lcom/qihoo/utils/notice/c;->a(J)Z

    move-result v0

    return v0
.end method

.method public static d()V
    .locals 2

    .prologue
    .line 374
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1008

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 375
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1013

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 376
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1006

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 377
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x100f

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 378
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1011

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 379
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1010

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 380
    return-void
.end method

.method private static d(Landroid/content/Context;)Z
    .locals 8

    .prologue
    const-wide/16 v6, 0x0

    const/4 v0, 0x0

    .line 425
    const-string/jumbo v1, "key_notice_push_one_day"

    invoke-static {p0, v1, v6, v7}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    .line 426
    invoke-static {v2, v3}, Lcom/qihoo/utils/notice/c;->a(J)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 427
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    .line 428
    cmp-long v1, v2, v6

    if-lez v1, :cond_0

    const-wide/32 v4, 0x1499700

    cmp-long v1, v2, v4

    if-gez v1, :cond_0

    const/4 v0, 0x1

    .line 430
    :cond_0
    return v0
.end method

.method private static e(Landroid/content/Context;)Z
    .locals 4

    .prologue
    .line 469
    const-string/jumbo v0, "key_notice_boost_click_time"

    const-wide/16 v2, 0x0

    invoke-static {p0, v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    .line 470
    invoke-static {v0, v1}, Lcom/qihoo/utils/notice/c;->a(J)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I
    .locals 3

    .prologue
    const v0, 0x7f0200c6

    .line 114
    sget-object v1, Lcom/qihoo/utils/notice/c$1;->a:[I

    invoke-virtual {p1}, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 122
    :goto_0
    :pswitch_0
    return v0

    .line 118
    :pswitch_1
    const v0, 0x7f0200c7

    goto :goto_0

    .line 120
    :pswitch_2
    const v0, 0x7f0200c8

    goto :goto_0

    .line 114
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public b(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I
    .locals 3

    .prologue
    const v0, 0x7f0200c9

    .line 127
    sget-object v1, Lcom/qihoo/utils/notice/c$1;->a:[I

    invoke-virtual {p1}, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 135
    :goto_0
    :pswitch_0
    return v0

    .line 131
    :pswitch_1
    const v0, 0x7f0200ca

    goto :goto_0

    .line 133
    :pswitch_2
    const v0, 0x7f0200cb

    goto :goto_0

    .line 127
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public c(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I
    .locals 3

    .prologue
    const v0, 0x7f0200ce

    .line 140
    sget-object v1, Lcom/qihoo/utils/notice/c$1;->a:[I

    invoke-virtual {p1}, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 148
    :goto_0
    :pswitch_0
    return v0

    .line 144
    :pswitch_1
    const v0, 0x7f0200d0

    goto :goto_0

    .line 146
    :pswitch_2
    const v0, 0x7f0200c3

    goto :goto_0

    .line 140
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I
    .locals 3

    .prologue
    const v0, 0x7f0200cf

    .line 153
    sget-object v1, Lcom/qihoo/utils/notice/c$1;->a:[I

    invoke-virtual {p1}, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 161
    :goto_0
    :pswitch_0
    return v0

    .line 157
    :pswitch_1
    const v0, 0x7f0200d1

    goto :goto_0

    .line 159
    :pswitch_2
    const v0, 0x7f0200c4

    goto :goto_0

    .line 153
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
