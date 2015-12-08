.class public Lorg/chromium/content/browser/input/AdapterInputConnection;
.super Landroid/view/inputmethod/BaseInputConnection;
.source "AdapterInputConnection.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/browser/input/AdapterInputConnection$ImeState;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field public static final INVALID_COMPOSITION:I = -0x1

.field public static final INVALID_SELECTION:I = -0x1

.field private static final TAG:Ljava/lang/String; = "AdapterInputConnection"


# instance fields
.field private final mEditable:Landroid/text/Editable;

.field private final mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

.field private final mInternalView:Landroid/view/View;

.field private mLastUpdateCompositionEnd:I

.field private mLastUpdateCompositionStart:I

.field private mLastUpdateSelectionEnd:I

.field private mLastUpdateSelectionStart:I

.field private mNumNestedBatchEdits:I

.field private mSingleLine:Z


# direct methods
.method constructor <init>(Landroid/view/View;Lorg/chromium/content/browser/input/ImeAdapter;Landroid/text/Editable;Landroid/view/inputmethod/EditorInfo;)V
    .locals 6
    .param p1, "view"    # Landroid/view/View;
    .param p2, "imeAdapter"    # Lorg/chromium/content/browser/input/ImeAdapter;
    .param p3, "editable"    # Landroid/text/Editable;
    .param p4, "outAttrs"    # Landroid/view/inputmethod/EditorInfo;
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    const v5, 0x8000

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v2, -0x1

    .line 51
    invoke-direct {p0, p1, v3}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 41
    iput v4, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mNumNestedBatchEdits:I

    .line 43
    iput v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mLastUpdateSelectionStart:I

    .line 44
    iput v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mLastUpdateSelectionEnd:I

    .line 45
    iput v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mLastUpdateCompositionStart:I

    .line 46
    iput v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mLastUpdateCompositionEnd:I

    .line 52
    iput-object p1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mInternalView:Landroid/view/View;

    .line 53
    iput-object p2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    .line 54
    iget-object v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    invoke-virtual {v2, p0}, Lorg/chromium/content/browser/input/ImeAdapter;->setInputConnection(Lorg/chromium/content/browser/input/AdapterInputConnection;)V

    .line 55
    iput-object p3, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    .line 59
    iget-object v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v2}, Lorg/chromium/content/browser/input/AdapterInputConnection;->removeComposingSpans(Landroid/text/Spannable;)V

    .line 60
    iput-boolean v3, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mSingleLine:Z

    .line 61
    const/high16 v2, 0x12000000

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 63
    const/16 v2, 0xa1

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 66
    invoke-virtual {p2}, Lorg/chromium/content/browser/input/ImeAdapter;->getTextInputType()I

    move-result v1

    .line 67
    .local v1, "inputType":I
    invoke-virtual {p2}, Lorg/chromium/content/browser/input/ImeAdapter;->getTextInputFlags()I

    move-result v0

    .line 68
    .local v0, "inputFlags":I
    sget v2, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputFlagAutocompleteOff:I

    and-int/2addr v2, v0

    if-eqz v2, :cond_0

    .line 69
    iget v2, p4, Landroid/view/inputmethod/EditorInfo;->inputType:I

    const/high16 v3, 0x80000

    or-int/2addr v2, v3

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 72
    :cond_0
    sget v2, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeText:I

    if-ne v1, v2, :cond_2

    .line 74
    iget v2, p4, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    or-int/lit8 v2, v2, 0x2

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 75
    sget v2, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputFlagAutocorrectOff:I

    and-int/2addr v2, v0

    if-nez v2, :cond_1

    .line 76
    iget v2, p4, Landroid/view/inputmethod/EditorInfo;->inputType:I

    or-int/2addr v2, v5

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 119
    :cond_1
    :goto_0
    iget-object v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v2}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v2

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 120
    iget-object v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v2}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v2

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 121
    iget-object v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v2}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v2

    iput v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mLastUpdateSelectionStart:I

    .line 122
    iget-object v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v2}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v2

    iput v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mLastUpdateSelectionEnd:I

    .line 124
    iget-object v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    iget v3, p4, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    iget v4, p4, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    invoke-static {v2, v3, v4}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;II)V

    .line 125
    invoke-direct {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->updateSelectionIfRequired()V

    .line 126
    return-void

    .line 78
    :cond_2
    sget v2, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeTextArea:I

    if-eq v1, v2, :cond_3

    sget v2, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeContentEditable:I

    if-ne v1, v2, :cond_5

    .line 81
    :cond_3
    iget v2, p4, Landroid/view/inputmethod/EditorInfo;->inputType:I

    const v3, 0x24000

    or-int/2addr v2, v3

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 83
    sget v2, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputFlagAutocorrectOff:I

    and-int/2addr v2, v0

    if-nez v2, :cond_4

    .line 84
    iget v2, p4, Landroid/view/inputmethod/EditorInfo;->inputType:I

    or-int/2addr v2, v5

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 86
    :cond_4
    iget v2, p4, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 87
    iput-boolean v4, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mSingleLine:Z

    goto :goto_0

    .line 88
    :cond_5
    sget v2, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypePassword:I

    if-ne v1, v2, :cond_6

    .line 90
    const/16 v2, 0xe1

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 92
    iget v2, p4, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    or-int/lit8 v2, v2, 0x2

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    goto :goto_0

    .line 93
    :cond_6
    sget v2, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeSearch:I

    if-ne v1, v2, :cond_7

    .line 95
    iget v2, p4, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    or-int/lit8 v2, v2, 0x3

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    goto :goto_0

    .line 96
    :cond_7
    sget v2, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeUrl:I

    if-ne v1, v2, :cond_8

    .line 98
    const/16 v2, 0x11

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 100
    iget v2, p4, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    or-int/lit8 v2, v2, 0x2

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    goto :goto_0

    .line 101
    :cond_8
    sget v2, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeEmail:I

    if-ne v1, v2, :cond_9

    .line 103
    const/16 v2, 0xd1

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 105
    iget v2, p4, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    or-int/lit8 v2, v2, 0x2

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    goto/16 :goto_0

    .line 106
    :cond_9
    sget v2, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeTel:I

    if-ne v1, v2, :cond_a

    .line 110
    const/4 v2, 0x3

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 111
    iget v2, p4, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    or-int/lit8 v2, v2, 0x5

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    goto/16 :goto_0

    .line 112
    :cond_a
    sget v2, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeNumber:I

    if-ne v1, v2, :cond_1

    .line 114
    const/16 v2, 0x2002

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 117
    iget v2, p4, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    or-int/lit8 v2, v2, 0x5

    iput v2, p4, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    goto/16 :goto_0
.end method

.method private getInputMethodManagerWrapper()Lorg/chromium/content/browser/input/InputMethodManagerWrapper;
    .locals 1

    .prologue
    .line 486
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/ImeAdapter;->getInputMethodManagerWrapper()Lorg/chromium/content/browser/input/InputMethodManagerWrapper;

    move-result-object v0

    return-object v0
.end method

.method private maybePerformEmptyCompositionWorkaround(Ljava/lang/CharSequence;)Z
    .locals 7
    .param p1, "text"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v6, -0x1

    .line 499
    iget-object v5, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v5}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v4

    .line 500
    .local v4, "selectionStart":I
    iget-object v5, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v5}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v3

    .line 501
    .local v3, "selectionEnd":I
    iget-object v5, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v5}, Lorg/chromium/content/browser/input/AdapterInputConnection;->getComposingSpanStart(Landroid/text/Spannable;)I

    move-result v1

    .line 502
    .local v1, "compositionStart":I
    iget-object v5, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v5}, Lorg/chromium/content/browser/input/AdapterInputConnection;->getComposingSpanEnd(Landroid/text/Spannable;)I

    move-result v0

    .line 503
    .local v0, "compositionEnd":I
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    if-ne v4, v3, :cond_0

    if-eq v1, v6, :cond_0

    if-eq v0, v6, :cond_0

    .line 506
    invoke-virtual {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->beginBatchEdit()Z

    .line 507
    invoke-virtual {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->finishComposingText()Z

    .line 508
    iget-object v5, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v5}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v2

    .line 509
    .local v2, "selection":I
    sub-int v5, v2, v1

    sub-int v6, v2, v0

    invoke-virtual {p0, v5, v6}, Lorg/chromium/content/browser/input/AdapterInputConnection;->deleteSurroundingText(II)Z

    .line 510
    invoke-virtual {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->endBatchEdit()Z

    .line 511
    const/4 v5, 0x1

    .line 513
    .end local v2    # "selection":I
    :goto_0
    return v5

    :cond_0
    const/4 v5, 0x0

    goto :goto_0
.end method

.method private updateSelectionIfRequired()V
    .locals 6

    .prologue
    .line 194
    iget v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mNumNestedBatchEdits:I

    if-eqz v0, :cond_1

    .line 218
    :cond_0
    :goto_0
    return-void

    .line 195
    :cond_1
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v2

    .line 196
    .local v2, "selectionStart":I
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v3

    .line 197
    .local v3, "selectionEnd":I
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->getComposingSpanStart(Landroid/text/Spannable;)I

    move-result v4

    .line 198
    .local v4, "compositionStart":I
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->getComposingSpanEnd(Landroid/text/Spannable;)I

    move-result v5

    .line 200
    .local v5, "compositionEnd":I
    iget v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mLastUpdateSelectionStart:I

    if-ne v0, v2, :cond_2

    iget v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mLastUpdateSelectionEnd:I

    if-ne v0, v3, :cond_2

    iget v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mLastUpdateCompositionStart:I

    if-ne v0, v4, :cond_2

    iget v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mLastUpdateCompositionEnd:I

    if-eq v0, v5, :cond_0

    .line 212
    :cond_2
    invoke-direct {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->getInputMethodManagerWrapper()Lorg/chromium/content/browser/input/InputMethodManagerWrapper;

    move-result-object v0

    iget-object v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mInternalView:Landroid/view/View;

    invoke-virtual/range {v0 .. v5}, Lorg/chromium/content/browser/input/InputMethodManagerWrapper;->updateSelection(Landroid/view/View;IIII)V

    .line 214
    iput v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mLastUpdateSelectionStart:I

    .line 215
    iput v3, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mLastUpdateSelectionEnd:I

    .line 216
    iput v4, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mLastUpdateCompositionStart:I

    .line 217
    iput v5, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mLastUpdateCompositionEnd:I

    goto :goto_0
.end method


# virtual methods
.method public beginBatchEdit()Z
    .locals 1

    .prologue
    .line 307
    iget v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mNumNestedBatchEdits:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mNumNestedBatchEdits:I

    .line 308
    const/4 v0, 0x1

    return v0
.end method

.method public commitText(Ljava/lang/CharSequence;I)Z
    .locals 3
    .param p1, "text"    # Ljava/lang/CharSequence;
    .param p2, "newCursorPosition"    # I

    .prologue
    const/4 v0, 0x1

    .line 238
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/input/AdapterInputConnection;->maybePerformEmptyCompositionWorkaround(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 241
    :goto_0
    return v0

    .line 239
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->commitText(Ljava/lang/CharSequence;I)Z

    .line 240
    invoke-direct {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->updateSelectionIfRequired()V

    .line 241
    iget-object v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_1

    :goto_1
    invoke-virtual {v1, p1, p2, v0}, Lorg/chromium/content/browser/input/ImeAdapter;->checkCompositionQueueAndCallNative(Ljava/lang/CharSequence;IZ)Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public deleteSurroundingText(II)Z
    .locals 12
    .param p1, "beforeLength"    # I
    .param p2, "afterLength"    # I

    .prologue
    const/4 v2, 0x1

    const/4 v5, 0x0

    .line 331
    move v10, p1

    .line 332
    .local v10, "originalBeforeLength":I
    move v9, p2

    .line 333
    .local v9, "originalAfterLength":I
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v8

    .line 334
    .local v8, "availableBefore":I
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    iget-object v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v1

    sub-int v7, v0, v1

    .line 335
    .local v7, "availableAfter":I
    invoke-static {p1, v8}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 336
    invoke-static {p2, v7}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 337
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->deleteSurroundingText(II)Z

    .line 338
    invoke-direct {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->updateSelectionIfRequired()V

    .line 343
    const/4 v4, 0x0

    .line 344
    .local v4, "keyCode":I
    if-ne v10, v2, :cond_1

    if-nez v9, :cond_1

    .line 345
    const/16 v4, 0x43

    .line 349
    :cond_0
    :goto_0
    const/4 v11, 0x1

    .line 350
    .local v11, "result":Z
    if-nez v4, :cond_2

    .line 351
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    sget v1, Lorg/chromium/content/browser/input/ImeAdapter;->sEventTypeRawKeyDown:I

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    move v6, v5

    invoke-virtual/range {v0 .. v6}, Lorg/chromium/content/browser/input/ImeAdapter;->sendSyntheticKeyEvent(IJIII)Z

    move-result v11

    .line 353
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    invoke-virtual {v0, p1, p2}, Lorg/chromium/content/browser/input/ImeAdapter;->deleteSurroundingText(II)Z

    move-result v0

    and-int/2addr v11, v0

    .line 354
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    sget v1, Lorg/chromium/content/browser/input/ImeAdapter;->sEventTypeKeyUp:I

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    move v6, v5

    invoke-virtual/range {v0 .. v6}, Lorg/chromium/content/browser/input/ImeAdapter;->sendSyntheticKeyEvent(IJIII)Z

    move-result v0

    and-int/2addr v11, v0

    .line 360
    :goto_1
    return v11

    .line 346
    .end local v11    # "result":Z
    :cond_1
    if-nez v10, :cond_0

    if-ne v9, v2, :cond_0

    .line 347
    const/16 v4, 0x70

    goto :goto_0

    .line 357
    .restart local v11    # "result":Z
    :cond_2
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    const/4 v1, 0x6

    invoke-virtual {v0, v4, v1}, Lorg/chromium/content/browser/input/ImeAdapter;->sendKeyEventWithKeyCode(II)V

    goto :goto_1
.end method

.method public endBatchEdit()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 316
    iget v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mNumNestedBatchEdits:I

    if-nez v1, :cond_1

    .line 320
    :cond_0
    :goto_0
    return v0

    .line 317
    :cond_1
    iget v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mNumNestedBatchEdits:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mNumNestedBatchEdits:I

    .line 319
    iget v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mNumNestedBatchEdits:I

    if-nez v1, :cond_2

    invoke-direct {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->updateSelectionIfRequired()V

    .line 320
    :cond_2
    iget v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mNumNestedBatchEdits:I

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public finishComposingText()Z
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 419
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->getComposingSpanStart(Landroid/text/Spannable;)I

    move-result v0

    iget-object v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v1}, Lorg/chromium/content/browser/input/AdapterInputConnection;->getComposingSpanEnd(Landroid/text/Spannable;)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 427
    :goto_0
    return v2

    .line 423
    :cond_0
    invoke-super {p0}, Landroid/view/inputmethod/BaseInputConnection;->finishComposingText()Z

    .line 424
    invoke-direct {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->updateSelectionIfRequired()V

    .line 425
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/ImeAdapter;->finishComposingText()V

    goto :goto_0
.end method

.method public getEditable()Landroid/text/Editable;
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    return-object v0
.end method

.method public getExtractedText(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;
    .locals 2
    .param p1, "request"    # Landroid/view/inputmethod/ExtractedTextRequest;
    .param p2, "flags"    # I

    .prologue
    .line 292
    new-instance v0, Landroid/view/inputmethod/ExtractedText;

    invoke-direct {v0}, Landroid/view/inputmethod/ExtractedText;-><init>()V

    .line 293
    .local v0, "et":Landroid/view/inputmethod/ExtractedText;
    iget-object v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Landroid/view/inputmethod/ExtractedText;->text:Ljava/lang/CharSequence;

    .line 294
    iget-object v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->partialEndOffset:I

    .line 295
    iget-object v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v1

    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->selectionStart:I

    .line 296
    iget-object v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v1

    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->selectionEnd:I

    .line 297
    iget-boolean v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mSingleLine:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->flags:I

    .line 298
    return-object v0

    .line 297
    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method getImeStateForTesting()Lorg/chromium/content/browser/input/AdapterInputConnection$ImeState;
    .locals 6
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    .line 536
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 537
    .local v1, "text":Ljava/lang/String;
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v2

    .line 538
    .local v2, "selectionStart":I
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v3

    .line 539
    .local v3, "selectionEnd":I
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->getComposingSpanStart(Landroid/text/Spannable;)I

    move-result v4

    .line 540
    .local v4, "compositionStart":I
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->getComposingSpanEnd(Landroid/text/Spannable;)I

    move-result v5

    .line 541
    .local v5, "compositionEnd":I
    new-instance v0, Lorg/chromium/content/browser/input/AdapterInputConnection$ImeState;

    invoke-direct/range {v0 .. v5}, Lorg/chromium/content/browser/input/AdapterInputConnection$ImeState;-><init>(Ljava/lang/String;IIII)V

    return-object v0
.end method

.method isActive()Z
    .locals 2

    .prologue
    .line 482
    invoke-direct {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->getInputMethodManagerWrapper()Lorg/chromium/content/browser/input/InputMethodManagerWrapper;

    move-result-object v0

    iget-object v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mInternalView:Landroid/view/View;

    invoke-virtual {v0, v1}, Lorg/chromium/content/browser/input/InputMethodManagerWrapper;->isActive(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method public performContextMenuAction(I)Z
    .locals 1
    .param p1, "id"    # I

    .prologue
    .line 271
    packed-switch p1, :pswitch_data_0

    .line 281
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 273
    :pswitch_0
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/ImeAdapter;->selectAll()Z

    move-result v0

    goto :goto_0

    .line 275
    :pswitch_1
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/ImeAdapter;->cut()Z

    move-result v0

    goto :goto_0

    .line 277
    :pswitch_2
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/ImeAdapter;->copy()Z

    move-result v0

    goto :goto_0

    .line 279
    :pswitch_3
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/ImeAdapter;->paste()Z

    move-result v0

    goto :goto_0

    .line 271
    nop

    :pswitch_data_0
    .packed-switch 0x102001f
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public performEditorAction(I)Z
    .locals 7
    .param p1, "actionCode"    # I

    .prologue
    const/4 v5, 0x0

    .line 251
    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    .line 252
    invoke-virtual {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->restartInput()V

    .line 254
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 255
    .local v2, "timeStampMs":J
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    sget v1, Lorg/chromium/content/browser/input/ImeAdapter;->sEventTypeRawKeyDown:I

    const/16 v4, 0x3d

    move v6, v5

    invoke-virtual/range {v0 .. v6}, Lorg/chromium/content/browser/input/ImeAdapter;->sendSyntheticKeyEvent(IJIII)Z

    .line 262
    .end local v2    # "timeStampMs":J
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 258
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    const/16 v1, 0x42

    const/16 v4, 0x16

    invoke-virtual {v0, v1, v4}, Lorg/chromium/content/browser/input/ImeAdapter;->sendKeyEventWithKeyCode(II)V

    goto :goto_0
.end method

.method restartInput()V
    .locals 2

    .prologue
    .line 449
    invoke-direct {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->getInputMethodManagerWrapper()Lorg/chromium/content/browser/input/InputMethodManagerWrapper;

    move-result-object v0

    iget-object v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mInternalView:Landroid/view/View;

    invoke-virtual {v0, v1}, Lorg/chromium/content/browser/input/InputMethodManagerWrapper;->restartInput(Landroid/view/View;)V

    .line 450
    const/4 v0, 0x0

    iput v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mNumNestedBatchEdits:I

    .line 451
    return-void
.end method

.method public sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 9
    .param p1, "event"    # Landroid/view/KeyEvent;

    .prologue
    const/16 v8, 0x70

    const/16 v7, 0x43

    const/4 v5, 0x0

    const/4 v6, 0x1

    .line 374
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v4

    if-ne v4, v6, :cond_5

    .line 375
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v4

    if-ne v4, v7, :cond_1

    .line 376
    invoke-virtual {p0, v6, v5}, Lorg/chromium/content/browser/input/AdapterInputConnection;->deleteSurroundingText(II)Z

    .line 410
    :cond_0
    :goto_0
    return v6

    .line 378
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v4

    if-ne v4, v8, :cond_2

    .line 379
    invoke-virtual {p0, v5, v6}, Lorg/chromium/content/browser/input/AdapterInputConnection;->deleteSurroundingText(II)Z

    goto :goto_0

    .line 382
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v3

    .line 383
    .local v3, "unicodeChar":I
    if-eqz v3, :cond_4

    .line 384
    iget-object v4, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v4}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v1

    .line 385
    .local v1, "selectionStart":I
    iget-object v4, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v4}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v0

    .line 386
    .local v0, "selectionEnd":I
    if-le v1, v0, :cond_3

    .line 387
    move v2, v1

    .line 388
    .local v2, "temp":I
    move v1, v0

    .line 389
    move v0, v2

    .line 391
    .end local v2    # "temp":I
    :cond_3
    iget-object v4, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    int-to-char v5, v3

    invoke-static {v5}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v1, v0, v5}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 409
    .end local v0    # "selectionEnd":I
    .end local v1    # "selectionStart":I
    .end local v3    # "unicodeChar":I
    :cond_4
    iget-object v4, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    invoke-virtual {v4, p1}, Lorg/chromium/content/browser/input/ImeAdapter;->translateAndSendNativeEvents(Landroid/view/KeyEvent;)Z

    goto :goto_0

    .line 395
    :cond_5
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v4

    if-nez v4, :cond_4

    .line 397
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v4

    const/16 v5, 0x42

    if-ne v4, v5, :cond_6

    .line 398
    invoke-virtual {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->beginBatchEdit()Z

    .line 399
    invoke-virtual {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->finishComposingText()Z

    .line 400
    iget-object v4, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    invoke-virtual {v4, p1}, Lorg/chromium/content/browser/input/ImeAdapter;->translateAndSendNativeEvents(Landroid/view/KeyEvent;)Z

    .line 401
    invoke-virtual {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->endBatchEdit()Z

    goto :goto_0

    .line 403
    :cond_6
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v4

    if-eq v4, v7, :cond_0

    .line 405
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v4

    if-ne v4, v8, :cond_4

    goto :goto_0
.end method

.method public setComposingRegion(II)Z
    .locals 5
    .param p1, "start"    # I
    .param p2, "end"    # I

    .prologue
    .line 459
    iget-object v4, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-interface {v4}, Landroid/text/Editable;->length()I

    move-result v3

    .line 460
    .local v3, "textLength":I
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 461
    .local v0, "a":I
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 462
    .local v1, "b":I
    if-gez v0, :cond_0

    const/4 v0, 0x0

    .line 463
    :cond_0
    if-gez v1, :cond_1

    const/4 v1, 0x0

    .line 464
    :cond_1
    if-le v0, v3, :cond_2

    move v0, v3

    .line 465
    :cond_2
    if-le v1, v3, :cond_3

    move v1, v3

    .line 467
    :cond_3
    if-ne v0, v1, :cond_5

    .line 468
    iget-object v4, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v4}, Lorg/chromium/content/browser/input/AdapterInputConnection;->removeComposingSpans(Landroid/text/Spannable;)V

    .line 472
    :goto_0
    invoke-direct {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->updateSelectionIfRequired()V

    .line 474
    const/4 v2, 0x0

    .line 475
    .local v2, "regionText":Ljava/lang/CharSequence;
    if-le v1, v0, :cond_4

    .line 476
    iget-object v4, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-interface {v4, v0, v1}, Landroid/text/Editable;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v2

    .line 478
    :cond_4
    iget-object v4, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    invoke-virtual {v4, v2, v0, v1}, Lorg/chromium/content/browser/input/ImeAdapter;->setComposingRegion(Ljava/lang/CharSequence;II)Z

    move-result v4

    return v4

    .line 470
    .end local v2    # "regionText":Ljava/lang/CharSequence;
    :cond_5
    invoke-super {p0, v0, v1}, Landroid/view/inputmethod/BaseInputConnection;->setComposingRegion(II)Z

    goto :goto_0
.end method

.method public setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 2
    .param p1, "text"    # Ljava/lang/CharSequence;
    .param p2, "newCursorPosition"    # I

    .prologue
    .line 226
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/input/AdapterInputConnection;->maybePerformEmptyCompositionWorkaround(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 229
    :goto_0
    return v0

    .line 227
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->setComposingText(Ljava/lang/CharSequence;I)Z

    .line 228
    invoke-direct {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->updateSelectionIfRequired()V

    .line 229
    iget-object v0, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lorg/chromium/content/browser/input/ImeAdapter;->checkCompositionQueueAndCallNative(Ljava/lang/CharSequence;IZ)Z

    move-result v0

    goto :goto_0
.end method

.method public setSelection(II)Z
    .locals 2
    .param p1, "start"    # I
    .param p2, "end"    # I

    .prologue
    .line 436
    iget-object v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v0

    .line 437
    .local v0, "textLength":I
    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    if-gt p1, v0, :cond_0

    if-le p2, v0, :cond_1

    :cond_0
    const/4 v1, 0x1

    .line 440
    :goto_0
    return v1

    .line 438
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->setSelection(II)Z

    .line 439
    invoke-direct {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->updateSelectionIfRequired()V

    .line 440
    iget-object v1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;

    invoke-virtual {v1, p1, p2}, Lorg/chromium/content/browser/input/ImeAdapter;->setEditableSelectionOffsets(II)Z

    move-result v1

    goto :goto_0
.end method

.method public updateState(Ljava/lang/String;IIIIZ)V
    .locals 5
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "selectionStart"    # I
    .param p3, "selectionEnd"    # I
    .param p4, "compositionStart"    # I
    .param p5, "compositionEnd"    # I
    .param p6, "isNonImeChange"    # Z
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    .line 154
    if-nez p6, :cond_0

    .line 179
    :goto_0
    return-void

    .line 157
    :cond_0
    const/16 v2, 0xa0

    const/16 v3, 0x20

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    .line 159
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 160
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {p3, v2}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 161
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {p4, v2}, Ljava/lang/Math;->min(II)I

    move-result p4

    .line 162
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {p5, v2}, Ljava/lang/Math;->min(II)I

    move-result p5

    .line 164
    iget-object v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 165
    .local v0, "prevText":Ljava/lang/String;
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 167
    .local v1, "textUnchanged":Z
    if-nez v1, :cond_1

    .line 168
    iget-object v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    const/4 v3, 0x0

    iget-object v4, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-interface {v4}, Landroid/text/Editable;->length()I

    move-result v4

    invoke-interface {v2, v3, v4, p1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 171
    :cond_1
    iget-object v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v2, p2, p3}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;II)V

    .line 173
    if-ne p4, p5, :cond_2

    .line 174
    iget-object v2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection;->mEditable:Landroid/text/Editable;

    invoke-static {v2}, Lorg/chromium/content/browser/input/AdapterInputConnection;->removeComposingSpans(Landroid/text/Spannable;)V

    .line 178
    :goto_1
    invoke-direct {p0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->updateSelectionIfRequired()V

    goto :goto_0

    .line 176
    :cond_2
    invoke-super {p0, p4, p5}, Landroid/view/inputmethod/BaseInputConnection;->setComposingRegion(II)Z

    goto :goto_1
.end method
