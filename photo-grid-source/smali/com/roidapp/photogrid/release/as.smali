.class public final Lcom/roidapp/photogrid/release/as;
.super Landroid/support/v4/app/DialogFragment;
.source "SourceFile"


# instance fields
.field private a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private b:Landroid/widget/EditText;

.field private c:Landroid/widget/EditText;

.field private d:Lcom/roidapp/photogrid/release/fm;

.field private e:Z

.field private f:I

.field private g:F

.field private h:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/as;->e:Z

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/as;F)F
    .locals 0

    .prologue
    .line 26
    iput p1, p0, Lcom/roidapp/photogrid/release/as;->g:F

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/as;)Z
    .locals 8

    .prologue
    const v7, 0x7f07011b

    const/4 v0, 0x1

    const/high16 v6, 0x40000000    # 2.0f

    const/4 v5, 0x0

    const v4, 0x7f070119

    .line 26
    .line 1212
    iget-object v1, p0, Lcom/roidapp/photogrid/release/as;->b:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1213
    iget-object v2, p0, Lcom/roidapp/photogrid/release/as;->c:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1214
    const-string v3, ""

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1215
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/as;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/as;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1, v7}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 1216
    iget-object v0, p0, Lcom/roidapp/photogrid/release/as;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 1247
    :goto_0
    const/4 v0, 0x0

    .line 1244
    :goto_1
    return v0

    .line 1217
    :cond_0
    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1218
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/as;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/as;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1, v7}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 1219
    iget-object v0, p0, Lcom/roidapp/photogrid/release/as;->c:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    goto :goto_0

    .line 1220
    :cond_1
    const-string v3, "."

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1221
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/as;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/as;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 1222
    iget-object v0, p0, Lcom/roidapp/photogrid/release/as;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    goto :goto_0

    .line 1223
    :cond_2
    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1224
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/as;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/as;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 1225
    iget-object v0, p0, Lcom/roidapp/photogrid/release/as;->c:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    goto :goto_0

    .line 1227
    :cond_3
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    .line 1228
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    .line 1229
    cmpg-float v3, v1, v5

    if-gtz v3, :cond_4

    .line 1230
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/as;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/as;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 1231
    iget-object v0, p0, Lcom/roidapp/photogrid/release/as;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    goto :goto_0

    .line 1234
    :cond_4
    cmpg-float v3, v2, v5

    if-gtz v3, :cond_5

    .line 1235
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/as;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/as;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 1236
    iget-object v0, p0, Lcom/roidapp/photogrid/release/as;->c:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    goto/16 :goto_0

    .line 1239
    :cond_5
    div-float v3, v1, v2

    cmpl-float v3, v3, v6

    if-gtz v3, :cond_6

    div-float v1, v2, v1

    cmpl-float v1, v1, v6

    if-lez v1, :cond_7

    .line 1240
    :cond_6
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/as;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/as;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f07011a

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1243
    :cond_7
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/as;->e:Z

    goto/16 :goto_1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/as;)F
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lcom/roidapp/photogrid/release/as;->g:F

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/as;F)F
    .locals 0

    .prologue
    .line 26
    iput p1, p0, Lcom/roidapp/photogrid/release/as;->h:F

    return p1
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/photogrid/release/as;->b:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/photogrid/release/as;->c:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/as;)F
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lcom/roidapp/photogrid/release/as;->h:F

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/as;)Z
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/as;->e:Z

    return v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/as;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/photogrid/release/as;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/as;)Lcom/roidapp/photogrid/release/fm;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/photogrid/release/as;->d:Lcom/roidapp/photogrid/release/fm;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/roidapp/photogrid/release/fm;I)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/roidapp/photogrid/release/as;->d:Lcom/roidapp/photogrid/release/fm;

    .line 53
    iput p2, p0, Lcom/roidapp/photogrid/release/as;->f:I

    .line 54
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 37
    const-string v0, "CustomRatioDialogFragment/onAttach"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    move-object v0, p1

    .line 38
    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/as;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 39
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onAttach(Landroid/app/Activity;)V

    .line 40
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .prologue
    .line 44
    const-string v0, "CustomRatioDialogFragment/onCreateView"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 45
    const v0, 0x7f03008b

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 1057
    const v0, 0x7f0d0212

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/as;->b:Landroid/widget/EditText;

    .line 1058
    const v0, 0x7f0d0214

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/as;->c:Landroid/widget/EditText;

    .line 1059
    const v0, 0x7f0d0218

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 1060
    const v1, 0x7f0d0216

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/SeekBar;

    .line 1061
    const v2, 0x7f0d0210

    invoke-virtual {v3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 1062
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->Z()[F

    move-result-object v4

    .line 1063
    if-eqz v4, :cond_3

    .line 1064
    new-instance v5, Ljava/math/BigDecimal;

    const/4 v6, 0x0

    aget v6, v4, v6

    float-to-double v6, v6

    invoke-direct {v5, v6, v7}, Ljava/math/BigDecimal;-><init>(D)V

    const/4 v6, 0x2

    const/4 v7, 0x4

    invoke-virtual {v5, v6, v7}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v5

    invoke-virtual {v5}, Ljava/math/BigDecimal;->floatValue()F

    move-result v5

    .line 1065
    new-instance v6, Ljava/math/BigDecimal;

    const/4 v7, 0x1

    aget v7, v4, v7

    float-to-double v8, v7

    invoke-direct {v6, v8, v9}, Ljava/math/BigDecimal;-><init>(D)V

    const/4 v7, 0x2

    const/4 v8, 0x4

    invoke-virtual {v6, v7, v8}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v6

    invoke-virtual {v6}, Ljava/math/BigDecimal;->floatValue()F

    move-result v6

    .line 1066
    const/4 v7, 0x2

    aget v7, v4, v7

    const/4 v8, 0x0

    cmpl-float v7, v7, v8

    if-nez v7, :cond_1

    .line 1067
    iget-object v7, p0, Lcom/roidapp/photogrid/release/as;->b:Landroid/widget/EditText;

    invoke-static {v5}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1068
    iget-object v7, p0, Lcom/roidapp/photogrid/release/as;->c:Landroid/widget/EditText;

    invoke-static {v6}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1069
    const/4 v7, 0x3

    aget v4, v4, v7

    float-to-int v4, v4

    invoke-virtual {v1, v4}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 1070
    cmpl-float v4, v5, v6

    if-lez v4, :cond_0

    .line 1071
    iget-object v4, p0, Lcom/roidapp/photogrid/release/as;->b:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->requestFocus()Z

    .line 1091
    :goto_0
    iget-object v4, p0, Lcom/roidapp/photogrid/release/as;->b:Landroid/widget/EditText;

    new-instance v5, Lcom/roidapp/photogrid/release/at;

    invoke-direct {v5, p0}, Lcom/roidapp/photogrid/release/at;-><init>(Lcom/roidapp/photogrid/release/as;)V

    invoke-virtual {v4, v5}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 1099
    iget-object v4, p0, Lcom/roidapp/photogrid/release/as;->c:Landroid/widget/EditText;

    new-instance v5, Lcom/roidapp/photogrid/release/au;

    invoke-direct {v5, p0}, Lcom/roidapp/photogrid/release/au;-><init>(Lcom/roidapp/photogrid/release/as;)V

    invoke-virtual {v4, v5}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 1106
    iget-object v4, p0, Lcom/roidapp/photogrid/release/as;->b:Landroid/widget/EditText;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/as;->b:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-interface {v5}, Landroid/text/Editable;->length()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/EditText;->setSelection(I)V

    .line 1107
    iget-object v4, p0, Lcom/roidapp/photogrid/release/as;->c:Landroid/widget/EditText;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/as;->c:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-interface {v5}, Landroid/text/Editable;->length()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/EditText;->setSelection(I)V

    .line 1108
    new-instance v4, Lcom/roidapp/photogrid/release/av;

    invoke-direct {v4, p0}, Lcom/roidapp/photogrid/release/av;-><init>(Lcom/roidapp/photogrid/release/as;)V

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1118
    new-instance v2, Lcom/roidapp/photogrid/release/aw;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/aw;-><init>(Lcom/roidapp/photogrid/release/as;)V

    invoke-virtual {v1, v2}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 1160
    new-instance v1, Lcom/roidapp/photogrid/release/ax;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/ax;-><init>(Lcom/roidapp/photogrid/release/as;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    return-object v3

    .line 1073
    :cond_0
    iget-object v4, p0, Lcom/roidapp/photogrid/release/as;->c:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->requestFocus()Z

    goto :goto_0

    .line 1076
    :cond_1
    iget-object v7, p0, Lcom/roidapp/photogrid/release/as;->b:Landroid/widget/EditText;

    invoke-static {v6}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1077
    iget-object v7, p0, Lcom/roidapp/photogrid/release/as;->c:Landroid/widget/EditText;

    invoke-static {v5}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1078
    const/4 v7, 0x3

    aget v4, v4, v7

    float-to-int v4, v4

    rsub-int/lit8 v4, v4, 0x64

    invoke-virtual {v1, v4}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 1079
    cmpl-float v4, v6, v5

    if-lez v4, :cond_2

    .line 1080
    iget-object v4, p0, Lcom/roidapp/photogrid/release/as;->b:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->requestFocus()Z

    goto :goto_0

    .line 1082
    :cond_2
    iget-object v4, p0, Lcom/roidapp/photogrid/release/as;->c:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->requestFocus()Z

    goto :goto_0

    .line 1088
    :cond_3
    const/16 v4, 0x32

    invoke-virtual {v1, v4}, Landroid/widget/SeekBar;->setProgress(I)V

    goto/16 :goto_0
.end method

.method public final onDestroy()V
    .locals 2

    .prologue
    .line 253
    const-string v0, "CustomRatioDialogFragment/onDestroy"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 254
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/as;->e:Z

    if-nez v0, :cond_1

    .line 255
    iget-object v0, p0, Lcom/roidapp/photogrid/release/as;->d:Lcom/roidapp/photogrid/release/fm;

    if-eqz v0, :cond_0

    .line 256
    iget-object v0, p0, Lcom/roidapp/photogrid/release/as;->d:Lcom/roidapp/photogrid/release/fm;

    iget v1, p0, Lcom/roidapp/photogrid/release/as;->f:I

    invoke-interface {v0, v1}, Lcom/roidapp/photogrid/release/fm;->a(I)V

    .line 258
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/as;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 260
    :cond_1
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onDestroy()V

    .line 262
    return-void
.end method
