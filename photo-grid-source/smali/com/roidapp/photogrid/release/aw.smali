.class final Lcom/roidapp/photogrid/release/aw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/as;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/as;)V
    .locals 0

    .prologue
    .line 118
    iput-object p1, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 6

    .prologue
    const/16 v0, 0x32

    const/4 v5, 0x4

    const/4 v4, 0x2

    const/high16 v1, 0x42c80000    # 100.0f

    const/high16 v2, 0x3f800000    # 1.0f

    .line 134
    if-ge p2, v0, :cond_0

    .line 135
    rsub-int/lit8 v0, p2, 0x32

    mul-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    div-float/2addr v0, v1

    .line 136
    iget-object v1, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    add-float/2addr v0, v2

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/as;->a(Lcom/roidapp/photogrid/release/as;F)F

    .line 137
    new-instance v0, Ljava/math/BigDecimal;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/as;->b(Lcom/roidapp/photogrid/release/as;)F

    move-result v1

    float-to-double v2, v1

    invoke-direct {v0, v2, v3}, Ljava/math/BigDecimal;-><init>(D)V

    .line 138
    iget-object v1, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/as;->c(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->requestFocus()Z

    .line 139
    iget-object v1, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/as;->c(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4, v5}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 140
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/as;->c(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/as;->c(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 141
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/as;->d(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "1.00"

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 157
    :goto_0
    return-void

    .line 142
    :cond_0
    if-le p2, v0, :cond_1

    .line 143
    add-int/lit8 v0, p2, -0x32

    mul-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    div-float/2addr v0, v1

    .line 144
    iget-object v1, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    add-float/2addr v0, v2

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/as;->b(Lcom/roidapp/photogrid/release/as;F)F

    .line 145
    new-instance v0, Ljava/math/BigDecimal;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/as;->e(Lcom/roidapp/photogrid/release/as;)F

    move-result v1

    float-to-double v2, v1

    invoke-direct {v0, v2, v3}, Ljava/math/BigDecimal;-><init>(D)V

    .line 146
    iget-object v1, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/as;->c(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v1

    const-string v2, "1.00"

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 147
    iget-object v1, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/as;->d(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->requestFocus()Z

    .line 148
    iget-object v1, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/as;->d(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4, v5}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 149
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/as;->d(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/as;->d(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    goto :goto_0

    .line 151
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/as;->d(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "1.00"

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 152
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/as;->d(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "1.00"

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 153
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/as;->c(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/as;->c(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 154
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/as;->d(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/aw;->a:Lcom/roidapp/photogrid/release/as;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/as;->d(Lcom/roidapp/photogrid/release/as;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    goto/16 :goto_0
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 128
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 123
    return-void
.end method
