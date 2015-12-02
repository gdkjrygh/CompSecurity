.class Lcom/qihoo/security/v5/UpdateService$2;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/v5/UpdateService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/v5/UpdateService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/v5/UpdateService;)V
    .locals 0

    .prologue
    .line 107
    iput-object p1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    .prologue
    const/16 v2, 0x698f

    const/4 v7, 0x2

    const/16 v5, 0xbb9

    const-wide/16 v8, 0x0

    const/4 v6, 0x0

    .line 111
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 116
    const-string/jumbo v0, "com.qihoo.antivirus.update.action.UPDATE_NOTICE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 120
    invoke-static {v2}, Lcom/qihoo/security/support/b;->b(I)V

    .line 121
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->a(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/v5/f;->a(Landroid/content/Context;)V

    .line 122
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->b(Lcom/qihoo/security/v5/UpdateService;)V

    .line 123
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 124
    const/4 v0, 0x0

    .line 125
    if-eqz v2, :cond_0

    .line 126
    invoke-static {v2}, Lcom/qihoo/security/v5/d;->a(Landroid/os/Bundle;)Lcom/qihoo/security/v5/d;

    move-result-object v0

    .line 127
    if-eqz v0, :cond_0

    .line 128
    const-string/jumbo v3, "app_version"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 130
    iget-object v4, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v4}, Lcom/qihoo/security/v5/UpdateService;->c(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v3}, Lcom/qihoo/security/v5/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 133
    :cond_0
    iget-object v3, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    iget-object v4, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v4}, Lcom/qihoo/security/v5/UpdateService;->d(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v4

    invoke-static {v3, v4, v1}, Lcom/qihoo/security/v5/UpdateService;->a(Lcom/qihoo/security/v5/UpdateService;ILjava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 134
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->d(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v0

    if-ne v0, v5, :cond_1

    .line 135
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 136
    const-string/jumbo v1, "UPDATE_TYPE"

    invoke-virtual {v0, v1, v7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 137
    const-string/jumbo v1, "type"

    iget-object v2, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v2}, Lcom/qihoo/security/v5/UpdateService;->d(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 138
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1, v0}, Lcom/qihoo/security/v5/UpdateService;->a(Lcom/qihoo/security/v5/UpdateService;Landroid/os/Bundle;)V

    .line 140
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/UpdateService;->stopSelf()V

    .line 427
    :cond_2
    :goto_0
    return-void

    .line 144
    :cond_3
    if-eqz v0, :cond_6

    .line 148
    iget-boolean v1, v0, Lcom/qihoo/security/v5/d;->e:Z

    if-eqz v1, :cond_4

    .line 149
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    iget-object v0, v0, Lcom/qihoo/security/v5/d;->c:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lcom/qihoo/security/v5/UpdateService;->a(Lcom/qihoo/security/v5/UpdateService;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 154
    :cond_4
    :goto_1
    const-string/jumbo v0, "UPDATE_TYPE"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 155
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->e(Lcom/qihoo/security/v5/UpdateService;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 157
    const-string/jumbo v0, "type"

    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->d(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 158
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0, v2}, Lcom/qihoo/security/v5/UpdateService;->a(Lcom/qihoo/security/v5/UpdateService;Landroid/os/Bundle;)V

    .line 164
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/UpdateService;->stopSelf()V

    goto :goto_0

    .line 152
    :cond_6
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1009

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    goto :goto_1

    .line 159
    :cond_7
    if-eqz v2, :cond_5

    .line 161
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/utils/notice/a;->a(Landroid/os/Bundle;)V

    .line 162
    const/16 v0, 0x6987

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_2

    .line 168
    :cond_8
    const-string/jumbo v0, "com.qihoo.antivirus.update.action.INSTALL_NOTICE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 169
    invoke-static {v2}, Lcom/qihoo/security/support/b;->b(I)V

    .line 170
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->f(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/v5/f;->a(Landroid/content/Context;)V

    .line 171
    const-string/jumbo v0, "app_path"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 172
    const-string/jumbo v1, "app_version"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 173
    iget-object v2, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v2}, Lcom/qihoo/security/v5/UpdateService;->g(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/qihoo/security/v5/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 174
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->h(Lcom/qihoo/security/v5/UpdateService;)V

    .line 178
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->d(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v1

    if-nez v1, :cond_a

    .line 179
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/utils/notice/a;->c(Ljava/lang/String;)V

    .line 180
    const/16 v0, 0x6987

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 189
    :cond_9
    :goto_3
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/UpdateService;->stopSelf()V

    goto/16 :goto_0

    .line 181
    :cond_a
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->d(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v1

    const/16 v2, 0xbba

    if-ne v1, v2, :cond_b

    .line 182
    invoke-static {p1, v0}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_3

    .line 183
    :cond_b
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->d(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v0

    if-ne v0, v5, :cond_9

    .line 184
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 185
    const-string/jumbo v1, "UPDATE_TYPE"

    invoke-virtual {v0, v1, v7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 186
    const-string/jumbo v1, "type"

    iget-object v2, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v2}, Lcom/qihoo/security/v5/UpdateService;->d(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 187
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1, v0}, Lcom/qihoo/security/v5/UpdateService;->a(Lcom/qihoo/security/v5/UpdateService;Landroid/os/Bundle;)V

    goto :goto_3

    .line 194
    :cond_c
    const-string/jumbo v0, "com.qihoo.antivirus.update.action.APP_PROGRESS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 195
    const-string/jumbo v0, "current"

    invoke-virtual {p2, v0, v8, v9}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    .line 196
    const-string/jumbo v2, "total"

    invoke-virtual {p2, v2, v8, v9}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    .line 197
    cmp-long v4, v2, v8

    if-lez v4, :cond_2

    cmp-long v4, v0, v2

    if-gtz v4, :cond_2

    .line 198
    const-wide/16 v4, 0x64

    mul-long/2addr v0, v4

    div-long/2addr v0, v2

    long-to-int v0, v0

    .line 199
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/utils/notice/a;->a(I)V

    goto/16 :goto_0

    .line 209
    :cond_d
    const-string/jumbo v0, "com.qihoo.antivirus.update.action.PATCH_FILE_NOTIFY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 210
    const-string/jumbo v0, "vdata_target_name"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 211
    const-string/jumbo v0, "vdata_patch_name"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 212
    const-string/jumbo v0, "vdata_method"

    invoke-virtual {p2, v0, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 213
    const-string/jumbo v0, "vdata_flag"

    invoke-virtual {p2, v0, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 214
    const-string/jumbo v0, "vdata_version"

    invoke-virtual {p2, v0, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 215
    const-string/jumbo v0, "vdata_patch_type"

    invoke-virtual {p2, v0, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    .line 221
    const/16 v0, 0x3e9

    if-ne v3, v0, :cond_e

    .line 222
    new-instance v0, Landroid/content/Intent;

    const-class v7, Lcom/qihoo/security/service/BsPatchService;

    invoke-direct {v0, p1, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string/jumbo v7, "com.qihoo.security.action.ACTION_BSPATCH"

    invoke-virtual {v0, v7}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v7, "patch_path"

    invoke-virtual {v0, v7, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v7, "target_path"

    invoke-virtual {v0, v7, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 227
    :cond_e
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->j(Lcom/qihoo/security/v5/UpdateService;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 228
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v0

    invoke-interface/range {v0 .. v6}, Lcom/qihoo/security/v5/b;->a(Ljava/lang/String;Ljava/lang/String;IIII)V

    goto/16 :goto_0

    .line 235
    :cond_f
    const-string/jumbo v0, "com.qihoo.antivirus.update.action.UPDATED_FILE_NOTIFY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 236
    const-string/jumbo v0, "vdata_target_name"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 237
    const-string/jumbo v1, "vdata_update_result"

    invoke-virtual {p2, v1, v6}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    .line 243
    if-nez v1, :cond_10

    .line 244
    iget-object v2, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-virtual {v2, v0}, Lcom/qihoo/security/v5/UpdateService;->a(Ljava/lang/String;)V

    .line 247
    :cond_10
    iget-object v2, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v2}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v2

    if-eqz v2, :cond_11

    iget-object v2, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v2}, Lcom/qihoo/security/v5/UpdateService;->j(Lcom/qihoo/security/v5/UpdateService;)Z

    move-result v2

    if-nez v2, :cond_11

    .line 248
    iget-object v2, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v2}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Lcom/qihoo/security/v5/b;->a(Ljava/lang/String;Z)V

    goto/16 :goto_0

    .line 251
    :cond_11
    if-eqz v1, :cond_12

    .line 252
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->k(Lcom/qihoo/security/v5/UpdateService;)V

    goto/16 :goto_0

    .line 255
    :cond_12
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->d(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v1

    if-ne v1, v5, :cond_2

    .line 256
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string/jumbo v1, ".apk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 257
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->l(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 264
    :cond_13
    const-string/jumbo v0, "com.qihoo.antivirus.update.action.APK_PATCH_ERROR"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 269
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->k(Lcom/qihoo/security/v5/UpdateService;)V

    .line 270
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/UpdateService;->stopSelf()V

    goto/16 :goto_0

    .line 274
    :cond_14
    const-string/jumbo v0, "com.qihoo.antivirus.update.action.CONNECT_RETRY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 275
    const/16 v0, 0x6992

    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->d(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v1

    int-to-long v2, v1

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    .line 276
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->m(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_15

    .line 277
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->n(Lcom/qihoo/security/v5/UpdateService;)I

    .line 284
    :cond_15
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v0

    if-eqz v0, :cond_16

    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->j(Lcom/qihoo/security/v5/UpdateService;)Z

    move-result v0

    if-nez v0, :cond_16

    .line 285
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/v5/b;->a()V

    goto/16 :goto_0

    .line 288
    :cond_16
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->o(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/v5/DownloadStatus;->PENDING:Lcom/qihoo/security/v5/DownloadStatus;

    invoke-static {v0, v1, v6}, Lcom/qihoo/security/v5/f;->a(Landroid/content/Context;Lcom/qihoo/security/v5/DownloadStatus;I)V

    goto/16 :goto_0

    .line 292
    :cond_17
    const-string/jumbo v0, "com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_BEGIN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 293
    const-string/jumbo v0, "data_file_path"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 294
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->p(Lcom/qihoo/security/v5/UpdateService;)Ljava/util/Map;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->j(Lcom/qihoo/security/v5/UpdateService;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 299
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/qihoo/security/v5/b;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 304
    :cond_18
    const-string/jumbo v0, "com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_END"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 305
    const-string/jumbo v0, "data_file_path"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 306
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->p(Lcom/qihoo/security/v5/UpdateService;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 307
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->p(Lcom/qihoo/security/v5/UpdateService;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 308
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    .line 310
    cmp-long v0, v2, v8

    if-lez v0, :cond_19

    const-wide/32 v4, 0x36ee80

    cmp-long v0, v2, v4

    if-gez v0, :cond_19

    .line 311
    const/16 v0, 0x6991

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 318
    :cond_19
    const-string/jumbo v0, "/"

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 319
    if-eqz v0, :cond_1b

    array-length v2, v0

    if-lez v2, :cond_1b

    .line 320
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    aget-object v0, v0, v2

    .line 321
    const-string/jumbo v2, "avedb.zip"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1c

    .line 322
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->d(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v0

    if-nez v0, :cond_1a

    invoke-static {p1}, Lcom/qihoo/security/service/e;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 323
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/utils/notice/a;->b()V

    .line 325
    :cond_1a
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->q(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v2, "malware_update_timestamp"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v0, v2, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 327
    const/16 v0, 0x37ea

    const-string/jumbo v2, "MD5"

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v3}, Lcom/qihoo360/common/utils/HashUtil;->getFileHash(Ljava/lang/String;Ljava/io/File;)[B

    move-result-object v2

    invoke-static {v2}, Lcom/qihoo360/common/utils/Utils;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, ""

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 335
    :cond_1b
    :goto_4
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->j(Lcom/qihoo/security/v5/UpdateService;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 336
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v0

    invoke-interface {v0, v1}, Lcom/qihoo/security/v5/b;->d(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 329
    :cond_1c
    const-string/jumbo v2, "b_g.dat"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 330
    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->a()Lcom/qihoo/security/gamebooster/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/b;->i()V

    goto :goto_4

    .line 341
    :cond_1d
    const-string/jumbo v0, "com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_INI"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 342
    const-string/jumbo v0, "data_file_count"

    invoke-virtual {p2, v0, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 346
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->j(Lcom/qihoo/security/v5/UpdateService;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 347
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/qihoo/security/v5/b;->b(I)V

    goto/16 :goto_0

    .line 352
    :cond_1e
    const-string/jumbo v0, "com.qihoo.antivirus.update.action.DATA_FILE_PROGRESS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 353
    const-string/jumbo v0, "current"

    invoke-virtual {p2, v0, v8, v9}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    .line 354
    const-string/jumbo v2, "total"

    invoke-virtual {p2, v2, v8, v9}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    .line 355
    cmp-long v4, v2, v8

    if-lez v4, :cond_1f

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1f

    .line 356
    const-wide/16 v4, 0x64

    mul-long/2addr v4, v0

    div-long/2addr v4, v2

    long-to-int v4, v4

    .line 363
    :cond_1f
    iget-object v4, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v4}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v4}, Lcom/qihoo/security/v5/UpdateService;->j(Lcom/qihoo/security/v5/UpdateService;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 364
    iget-object v4, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v4}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v4

    invoke-interface {v4, v0, v1, v2, v3}, Lcom/qihoo/security/v5/b;->a(JJ)V

    goto/16 :goto_0

    .line 369
    :cond_20
    const-string/jumbo v0, "com.qihoo.antivirus.update.action.ERROR"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_23

    .line 370
    const-string/jumbo v0, "error_code"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 371
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->r(Lcom/qihoo/security/v5/UpdateService;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    .line 372
    cmp-long v1, v2, v8

    if-lez v1, :cond_21

    const-wide/32 v4, 0x36ee80

    cmp-long v1, v2, v4

    if-gez v1, :cond_21

    .line 373
    const/16 v1, 0x6996

    iget-object v4, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v4}, Lcom/qihoo/security/v5/UpdateService;->d(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v4, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 377
    :cond_21
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 378
    const/16 v2, 0x698e

    int-to-long v4, v1

    invoke-static {v2, v4, v5}, Lcom/qihoo/security/support/b;->a(IJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 385
    :goto_5
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v1

    if-eqz v1, :cond_22

    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->j(Lcom/qihoo/security/v5/UpdateService;)Z

    move-result v1

    if-nez v1, :cond_22

    .line 386
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/qihoo/security/v5/b;->c(Ljava/lang/String;)V

    .line 387
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/UpdateService;->stopSelf()V

    goto/16 :goto_0

    .line 390
    :cond_22
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->s(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/v5/f;->a(Landroid/content/Context;)V

    .line 391
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->k(Lcom/qihoo/security/v5/UpdateService;)V

    .line 392
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/UpdateService;->stopSelf()V

    goto/16 :goto_0

    .line 396
    :cond_23
    const-string/jumbo v0, "com.qihoo.antivirus.update.action.UPDATE_CHECK_OVER"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 397
    const-string/jumbo v0, "data_file_version"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 401
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->t(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 402
    invoke-static {v2}, Lcom/qihoo/security/support/b;->b(I)V

    .line 403
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v1

    if-eqz v1, :cond_24

    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->j(Lcom/qihoo/security/v5/UpdateService;)Z

    move-result v1

    if-nez v1, :cond_24

    .line 404
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/qihoo/security/v5/b;->b(Ljava/lang/String;)V

    .line 405
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/UpdateService;->stopSelf()V

    goto/16 :goto_0

    .line 408
    :cond_24
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->u(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/v5/f;->a(Landroid/content/Context;)V

    .line 409
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->d(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v0

    if-eq v0, v5, :cond_25

    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->d(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v0

    const/16 v1, 0x3ea

    if-ne v0, v1, :cond_27

    .line 410
    :cond_25
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 411
    const-string/jumbo v1, "UPDATE_TYPE"

    invoke-virtual {v0, v1, v7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 412
    const-string/jumbo v1, "type"

    iget-object v2, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v2}, Lcom/qihoo/security/v5/UpdateService;->d(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 413
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1, v0}, Lcom/qihoo/security/v5/UpdateService;->a(Lcom/qihoo/security/v5/UpdateService;Landroid/os/Bundle;)V

    .line 420
    :cond_26
    :goto_6
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/UpdateService;->stopSelf()V

    goto/16 :goto_0

    .line 414
    :cond_27
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->d(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v0

    const/16 v1, 0xbba

    if-ne v0, v1, :cond_26

    .line 415
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 416
    const-string/jumbo v1, "UPDATE_TYPE"

    invoke-virtual {v0, v1, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 417
    const-string/jumbo v1, "type"

    iget-object v2, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v2}, Lcom/qihoo/security/v5/UpdateService;->d(Lcom/qihoo/security/v5/UpdateService;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 418
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$2;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1, v0}, Lcom/qihoo/security/v5/UpdateService;->a(Lcom/qihoo/security/v5/UpdateService;Landroid/os/Bundle;)V

    goto :goto_6

    .line 379
    :catch_0
    move-exception v1

    goto/16 :goto_5
.end method
