.class public final Lcom/roidapp/photogrid/release/qi;
.super Landroid/support/v4/app/DialogFragment;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Lcom/roidapp/photogrid/a/d;

.field private e:Z

.field private f:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 35
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 37
    iput v1, p0, Lcom/roidapp/photogrid/release/qi;->a:I

    .line 38
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/qi;->b:I

    .line 41
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/qi;->e:Z

    .line 46
    new-instance v0, Lcom/roidapp/photogrid/release/qj;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/qj;-><init>(Lcom/roidapp/photogrid/release/qi;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/qi;->f:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/qi;I)I
    .locals 0

    .prologue
    .line 35
    iput p1, p0, Lcom/roidapp/photogrid/release/qi;->c:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/qi;)V
    .locals 3

    .prologue
    .line 35
    .line 1245
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/qi;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 1246
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1281
    :cond_0
    :goto_0
    return-void

    .line 1250
    :cond_1
    :try_start_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/qi;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1251
    const v1, 0x7f0702e7

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 1252
    const v1, 0x7f07033d

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 1253
    const v1, 0x7f070137

    new-instance v2, Lcom/roidapp/photogrid/release/qp;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/qp;-><init>(Lcom/roidapp/photogrid/release/qi;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1261
    const v1, 0x7f070049

    new-instance v2, Lcom/roidapp/photogrid/release/qr;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/qr;-><init>(Lcom/roidapp/photogrid/release/qi;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/release/qq;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/qq;-><init>(Lcom/roidapp/photogrid/release/qi;)V

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 1275
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 1276
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 1278
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/view/WindowManager$BadTokenException;->printStackTrace()V

    goto :goto_0

    .line 1280
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/qi;Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 1148
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1149
    :cond_0
    :goto_0
    return-void

    .line 1151
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qi;->d:Lcom/roidapp/photogrid/a/d;

    if-eqz v0, :cond_2

    .line 1152
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qi;->d:Lcom/roidapp/photogrid/a/d;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/a/d;->a()V

    .line 1153
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/qi;->d:Lcom/roidapp/photogrid/a/d;

    .line 1155
    :cond_2
    new-instance v0, Lcom/roidapp/photogrid/a/d;

    const-string v1, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3hDBUTqCFEy0ee8FVgMli9SgoFAEwh6LplNMMRM3GMnUIZMapwISgCeyVeoX1d3idHCG3hSEd3t6ukuBvsiyTi3UYryPl9SvECTpaQLnyjJLxNdZB/a1h5Bwbk+4ugKWuKXMKTI8MpKmDD/wx1EexO7PntgM1Y28CFUeJD93C9qVRGQNKqjVdNm/jImEQeZcCEDXDw9j03psvXyE02Xj6HIcMBVvRbUynXWl8KtAY8fNHgGvb0JYRLnmz8ei14m6wqrXHPTpe5lZ4zHTEd7nsjTAUNfvdNqn2p662IWemg7h1Q34DaIZlVycqKy/URffwgNrixRKN3AY/Y2YD0O0GQIDAQAB"

    invoke-direct {v0, p1, v1}, Lcom/roidapp/photogrid/a/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/qi;->d:Lcom/roidapp/photogrid/a/d;

    .line 1156
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qi;->d:Lcom/roidapp/photogrid/a/d;

    new-instance v1, Lcom/roidapp/photogrid/release/qn;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/qn;-><init>(Lcom/roidapp/photogrid/release/qi;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/a/d;->a(Lcom/roidapp/photogrid/a/j;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/qi;Z)Z
    .locals 0

    .prologue
    .line 35
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/qi;->e:Z

    return p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/qi;)I
    .locals 1

    .prologue
    .line 35
    iget v0, p0, Lcom/roidapp/photogrid/release/qi;->a:I

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/qi;Landroid/app/Activity;)V
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 1181
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1233
    :cond_0
    :goto_0
    return-void

    .line 1186
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/qi;->e:Z

    if-eqz v0, :cond_4

    .line 1187
    const-string v0, "iab"

    const-string v1, "setup success"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1188
    const/4 v2, 0x0

    .line 1189
    const-string v3, "subs"

    .line 1191
    iget v0, p0, Lcom/roidapp/photogrid/release/qi;->c:I

    iget v1, p0, Lcom/roidapp/photogrid/release/qi;->a:I

    if-ne v0, v1, :cond_3

    .line 1192
    const-string v2, "com.roidapp.photogrid.remove_ad_year"

    .line 1193
    const/16 v4, 0x10

    .line 1194
    const-string v3, "subs"

    .line 1202
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qi;->d:Lcom/roidapp/photogrid/a/d;

    new-instance v5, Lcom/roidapp/photogrid/release/qo;

    invoke-direct {v5, p0}, Lcom/roidapp/photogrid/release/qo;-><init>(Lcom/roidapp/photogrid/release/qi;)V

    const-string v6, ""

    move-object v1, p1

    invoke-virtual/range {v0 .. v6}, Lcom/roidapp/photogrid/a/d;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILcom/roidapp/photogrid/a/i;Ljava/lang/String;)V

    goto :goto_0

    .line 1195
    :cond_3
    iget v0, p0, Lcom/roidapp/photogrid/release/qi;->c:I

    iget v1, p0, Lcom/roidapp/photogrid/release/qi;->b:I

    if-ne v0, v1, :cond_2

    .line 1196
    const-string v2, "com.roidapp.photogrid.remove_ad_lifelong"

    .line 1197
    const/16 v4, 0x20

    .line 1198
    const-string v3, "inapp"

    goto :goto_1

    .line 1234
    :cond_4
    const-string v0, "iab"

    const-string v1, "setup failed"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1236
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/qi;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0, v4}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;I)V

    .line 1237
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1238
    const/4 v1, 0x3

    iput v1, v0, Landroid/os/Message;->what:I

    .line 1239
    const/4 v1, 0x1

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 1240
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qi;->f:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/qi;)I
    .locals 1

    .prologue
    .line 35
    iget v0, p0, Lcom/roidapp/photogrid/release/qi;->b:I

    return v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/qi;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qi;->f:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/qi;)V
    .locals 1

    .prologue
    .line 35
    .line 2141
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qi;->d:Lcom/roidapp/photogrid/a/d;

    if-eqz v0, :cond_0

    .line 2142
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qi;->d:Lcom/roidapp/photogrid/a/d;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/a/d;->a()V

    .line 2143
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/qi;->d:Lcom/roidapp/photogrid/a/d;

    .line 35
    :cond_0
    return-void
.end method


# virtual methods
.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qi;->d:Lcom/roidapp/photogrid/a/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/qi;->d:Lcom/roidapp/photogrid/a/d;

    invoke-virtual {v0, p1, p2, p3}, Lcom/roidapp/photogrid/a/d;->a(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 134
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/DialogFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 136
    :cond_1
    return-void
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .prologue
    .line 287
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCancel(Landroid/content/DialogInterface;)V

    .line 288
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .prologue
    const v6, 0x7f0d0406

    const/4 v3, 0x0

    .line 79
    const v0, 0x7f030103

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 1086
    const v0, 0x7f0d0405

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f02035c

    invoke-static {v0, v1, v3, v3}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 1087
    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v1, 0x7f02036b

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 1089
    const v0, 0x7f0d040b

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1090
    const v1, 0x7f0d0408

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RadioButton;

    .line 1091
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "$1.99 "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/qi;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f07033f

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 1092
    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 1093
    iget v1, p0, Lcom/roidapp/photogrid/release/qi;->a:I

    iput v1, p0, Lcom/roidapp/photogrid/release/qi;->c:I

    .line 1095
    const v1, 0x7f0d0407

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RadioGroup;

    .line 1096
    new-instance v3, Lcom/roidapp/photogrid/release/qk;

    invoke-direct {v3, p0, v0}, Lcom/roidapp/photogrid/release/qk;-><init>(Lcom/roidapp/photogrid/release/qi;Landroid/widget/TextView;)V

    invoke-virtual {v1, v3}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 1110
    const v0, 0x7f0d040a

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1111
    new-instance v1, Lcom/roidapp/photogrid/release/ql;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/ql;-><init>(Lcom/roidapp/photogrid/release/qi;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1119
    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 1120
    new-instance v1, Lcom/roidapp/photogrid/release/qm;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/qm;-><init>(Lcom/roidapp/photogrid/release/qi;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    return-object v2
.end method
