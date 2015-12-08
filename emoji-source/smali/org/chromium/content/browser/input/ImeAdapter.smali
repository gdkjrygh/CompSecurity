.class public Lorg/chromium/content/browser/input/ImeAdapter;
.super Ljava/lang/Object;
.source "ImeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/browser/input/ImeAdapter$AdapterInputConnectionFactory;,
        Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;,
        Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# static fields
.field private static final COMPOSITION_KEY_CODE:I = 0xe5

.field private static final INPUT_DISMISS_DELAY:I = 0x96

.field static sEventTypeChar:I

.field static sEventTypeKeyUp:I

.field static sEventTypeRawKeyDown:I

.field static sKeyCharacterMap:Landroid/view/KeyCharacterMap;

.field static sModifierAlt:I

.field static sModifierCapsLockOn:I

.field static sModifierCtrl:I

.field static sModifierNumLockOn:I

.field static sModifierShift:I

.field static sSingleCharArray:[C

.field static sTextInputFlagAutocompleteOff:I

.field static sTextInputFlagAutocompleteOn:I

.field static sTextInputFlagAutocorrectOff:I

.field static sTextInputFlagAutocorrectOn:I

.field static sTextInputFlagNone:I

.field static sTextInputFlagSpellcheckOff:I

.field static sTextInputFlagSpellcheckOn:I

.field static sTextInputTypeContentEditable:I

.field static sTextInputTypeEmail:I

.field static sTextInputTypeNone:I

.field static sTextInputTypeNumber:I

.field static sTextInputTypePassword:I

.field static sTextInputTypeSearch:I

.field static sTextInputTypeTel:I

.field static sTextInputTypeText:I

.field static sTextInputTypeTextArea:I

.field static sTextInputTypeUrl:I


# instance fields
.field private mDismissInput:Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;

.field private final mHandler:Landroid/os/Handler;

.field private mInputConnection:Lorg/chromium/content/browser/input/AdapterInputConnection;

.field private mInputMethodManagerWrapper:Lorg/chromium/content/browser/input/InputMethodManagerWrapper;

.field mIsShowWithoutHideOutstanding:Z
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation
.end field

.field private mLastComposeText:Ljava/lang/String;

.field mLastSyntheticKeyCode:I
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation
.end field

.field private mNativeImeAdapterAndroid:J

.field private mTextInputFlags:I

.field private mTextInputType:I

.field private final mViewEmbedder:Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 121
    const/4 v0, 0x0

    sput v0, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputFlagNone:I

    .line 133
    const/4 v0, 0x1

    new-array v0, v0, [C

    sput-object v0, Lorg/chromium/content/browser/input/ImeAdapter;->sSingleCharArray:[C

    return-void
.end method

.method public constructor <init>(Lorg/chromium/content/browser/input/InputMethodManagerWrapper;Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;)V
    .locals 1
    .param p1, "wrapper"    # Lorg/chromium/content/browser/input/InputMethodManagerWrapper;
    .param p2, "embedder"    # Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;

    .prologue
    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 141
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mDismissInput:Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;

    .line 149
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mIsShowWithoutHideOutstanding:Z

    .line 158
    iput-object p1, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mInputMethodManagerWrapper:Lorg/chromium/content/browser/input/InputMethodManagerWrapper;

    .line 159
    iput-object p2, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mViewEmbedder:Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;

    .line 160
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mHandler:Landroid/os/Handler;

    .line 161
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/content/browser/input/ImeAdapter;Z)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/content/browser/input/ImeAdapter;
    .param p1, "x1"    # Z

    .prologue
    .line 49
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/input/ImeAdapter;->dismissInput(Z)V

    return-void
.end method

.method private static androidKeyEventForCharacter(C)Landroid/view/KeyEvent;
    .locals 5
    .param p0, "chr"    # C

    .prologue
    const/4 v2, 0x0

    .line 358
    sget-object v3, Lorg/chromium/content/browser/input/ImeAdapter;->sKeyCharacterMap:Landroid/view/KeyCharacterMap;

    if-nez v3, :cond_0

    .line 359
    const/4 v3, -0x1

    invoke-static {v3}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v3

    sput-object v3, Lorg/chromium/content/browser/input/ImeAdapter;->sKeyCharacterMap:Landroid/view/KeyCharacterMap;

    .line 361
    :cond_0
    sget-object v3, Lorg/chromium/content/browser/input/ImeAdapter;->sSingleCharArray:[C

    const/4 v4, 0x0

    aput-char p0, v3, v4

    .line 363
    sget-object v3, Lorg/chromium/content/browser/input/ImeAdapter;->sKeyCharacterMap:Landroid/view/KeyCharacterMap;

    sget-object v4, Lorg/chromium/content/browser/input/ImeAdapter;->sSingleCharArray:[C

    invoke-virtual {v3, v4}, Landroid/view/KeyCharacterMap;->getEvents([C)[Landroid/view/KeyEvent;

    move-result-object v0

    .line 364
    .local v0, "events":[Landroid/view/KeyEvent;
    if-nez v0, :cond_2

    .line 375
    :cond_1
    :goto_0
    return-object v2

    .line 368
    :cond_2
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    array-length v3, v0

    if-ge v1, v3, :cond_1

    .line 369
    aget-object v3, v0, v1

    invoke-virtual {v3}, Landroid/view/KeyEvent;->getAction()I

    move-result v3

    if-nez v3, :cond_3

    aget-object v3, v0, v1

    invoke-virtual {v3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v3

    invoke-static {v3}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    move-result v3

    if-nez v3, :cond_3

    .line 371
    aget-object v2, v0, v1

    goto :goto_0

    .line 368
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method private cancelComposition()V
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 697
    iget-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mInputConnection:Lorg/chromium/content/browser/input/AdapterInputConnection;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mInputConnection:Lorg/chromium/content/browser/input/AdapterInputConnection;

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->restartInput()V

    .line 698
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mLastComposeText:Ljava/lang/String;

    .line 699
    return-void
.end method

.method private dismissInput(Z)V
    .locals 5
    .param p1, "unzoomIfNeeded"    # Z

    .prologue
    const/4 v4, 0x0

    .line 312
    iput-boolean v4, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mIsShowWithoutHideOutstanding:Z

    .line 313
    iget-object v1, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mViewEmbedder:Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;

    invoke-interface {v1}, Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;->getAttachedView()Landroid/view/View;

    move-result-object v0

    .line 314
    .local v0, "view":Landroid/view/View;
    iget-object v1, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mInputMethodManagerWrapper:Lorg/chromium/content/browser/input/InputMethodManagerWrapper;

    invoke-virtual {v1, v0}, Lorg/chromium/content/browser/input/InputMethodManagerWrapper;->isActive(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 315
    iget-object v2, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mInputMethodManagerWrapper:Lorg/chromium/content/browser/input/InputMethodManagerWrapper;

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v3

    if-eqz p1, :cond_1

    iget-object v1, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mViewEmbedder:Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;

    invoke-interface {v1}, Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;->getNewShowKeyboardReceiver()Landroid/os/ResultReceiver;

    move-result-object v1

    :goto_0
    invoke-virtual {v2, v3, v4, v1}, Lorg/chromium/content/browser/input/InputMethodManagerWrapper;->hideSoftInputFromWindow(Landroid/os/IBinder;ILandroid/os/ResultReceiver;)Z

    .line 318
    :cond_0
    iget-object v1, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mViewEmbedder:Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;

    invoke-interface {v1}, Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;->onDismissInput()V

    .line 319
    return-void

    .line 315
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private focusedNodeChanged(Z)V
    .locals 1
    .param p1, "isEditable"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 673
    iget-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mInputConnection:Lorg/chromium/content/browser/input/AdapterInputConnection;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mInputConnection:Lorg/chromium/content/browser/input/AdapterInputConnection;

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->restartInput()V

    .line 674
    :cond_0
    return-void
.end method

.method private static getModifiers(I)I
    .locals 2
    .param p0, "metaState"    # I

    .prologue
    .line 225
    const/4 v0, 0x0

    .line 226
    .local v0, "modifiers":I
    and-int/lit8 v1, p0, 0x1

    if-eqz v1, :cond_0

    .line 227
    sget v1, Lorg/chromium/content/browser/input/ImeAdapter;->sModifierShift:I

    or-int/2addr v0, v1

    .line 229
    :cond_0
    and-int/lit8 v1, p0, 0x2

    if-eqz v1, :cond_1

    .line 230
    sget v1, Lorg/chromium/content/browser/input/ImeAdapter;->sModifierAlt:I

    or-int/2addr v0, v1

    .line 232
    :cond_1
    and-int/lit16 v1, p0, 0x1000

    if-eqz v1, :cond_2

    .line 233
    sget v1, Lorg/chromium/content/browser/input/ImeAdapter;->sModifierCtrl:I

    or-int/2addr v0, v1

    .line 235
    :cond_2
    const/high16 v1, 0x100000

    and-int/2addr v1, p0

    if-eqz v1, :cond_3

    .line 236
    sget v1, Lorg/chromium/content/browser/input/ImeAdapter;->sModifierCapsLockOn:I

    or-int/2addr v0, v1

    .line 238
    :cond_3
    const/high16 v1, 0x200000

    and-int/2addr v1, p0

    if-eqz v1, :cond_4

    .line 239
    sget v1, Lorg/chromium/content/browser/input/ImeAdapter;->sModifierNumLockOn:I

    or-int/2addr v0, v1

    .line 241
    :cond_4
    return v0
.end method

.method public static getTextInputTypeNone()I
    .locals 1

    .prologue
    .line 221
    sget v0, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeNone:I

    return v0
.end method

.method public static getTypedKeyEventGuess(Ljava/lang/String;Ljava/lang/String;)Landroid/view/KeyEvent;
    .locals 4
    .param p0, "oldtext"    # Ljava/lang/String;
    .param p1, "newtext"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 383
    if-nez p0, :cond_1

    .line 384
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 385
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lorg/chromium/content/browser/input/ImeAdapter;->androidKeyEventForCharacter(C)Landroid/view/KeyEvent;

    move-result-object v0

    .line 401
    :cond_0
    :goto_0
    return-object v0

    .line 392
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-le v1, v2, :cond_2

    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 393
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lorg/chromium/content/browser/input/ImeAdapter;->androidKeyEventForCharacter(C)Landroid/view/KeyEvent;

    move-result-object v0

    goto :goto_0

    .line 396
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v1, v2, :cond_0

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 397
    new-instance v0, Landroid/view/KeyEvent;

    const/16 v1, 0x43

    invoke-direct {v0, v3, v1}, Landroid/view/KeyEvent;-><init>(II)V

    goto :goto_0
.end method

.method private hasInputType()Z
    .locals 2

    .prologue
    .line 322
    iget v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mTextInputType:I

    sget v1, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeNone:I

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static initializeTextInputFlags(IIIIII)V
    .locals 0
    .param p0, "textInputFlagAutocompleteOn"    # I
    .param p1, "textInputFlagAutocompleteOff"    # I
    .param p2, "textInputFlagAutocorrectOn"    # I
    .param p3, "textInputFlagAutocorrectOff"    # I
    .param p4, "textInputFlagSpellcheckOn"    # I
    .param p5, "textInputFlagSpellcheckOff"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 663
    sput p0, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputFlagAutocompleteOn:I

    .line 664
    sput p1, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputFlagAutocompleteOff:I

    .line 665
    sput p2, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputFlagAutocorrectOn:I

    .line 666
    sput p3, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputFlagAutocorrectOff:I

    .line 667
    sput p4, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputFlagSpellcheckOn:I

    .line 668
    sput p5, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputFlagSpellcheckOff:I

    .line 669
    return-void
.end method

.method private static initializeTextInputTypes(IIIIIIIIII)V
    .locals 0
    .param p0, "textInputTypeNone"    # I
    .param p1, "textInputTypeText"    # I
    .param p2, "textInputTypeTextArea"    # I
    .param p3, "textInputTypePassword"    # I
    .param p4, "textInputTypeSearch"    # I
    .param p5, "textInputTypeUrl"    # I
    .param p6, "textInputTypeEmail"    # I
    .param p7, "textInputTypeTel"    # I
    .param p8, "textInputTypeNumber"    # I
    .param p9, "textInputTypeContentEditable"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 646
    sput p0, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeNone:I

    .line 647
    sput p1, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeText:I

    .line 648
    sput p2, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeTextArea:I

    .line 649
    sput p3, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypePassword:I

    .line 650
    sput p4, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeSearch:I

    .line 651
    sput p5, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeUrl:I

    .line 652
    sput p6, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeEmail:I

    .line 653
    sput p7, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeTel:I

    .line 654
    sput p8, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeNumber:I

    .line 655
    sput p9, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeContentEditable:I

    .line 656
    return-void
.end method

.method private static initializeWebInputEvents(IIIIIIII)V
    .locals 0
    .param p0, "eventTypeRawKeyDown"    # I
    .param p1, "eventTypeKeyUp"    # I
    .param p2, "eventTypeChar"    # I
    .param p3, "modifierShift"    # I
    .param p4, "modifierAlt"    # I
    .param p5, "modifierCtrl"    # I
    .param p6, "modifierCapsLockOn"    # I
    .param p7, "modifierNumLockOn"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 631
    sput p0, Lorg/chromium/content/browser/input/ImeAdapter;->sEventTypeRawKeyDown:I

    .line 632
    sput p1, Lorg/chromium/content/browser/input/ImeAdapter;->sEventTypeKeyUp:I

    .line 633
    sput p2, Lorg/chromium/content/browser/input/ImeAdapter;->sEventTypeChar:I

    .line 634
    sput p3, Lorg/chromium/content/browser/input/ImeAdapter;->sModifierShift:I

    .line 635
    sput p4, Lorg/chromium/content/browser/input/ImeAdapter;->sModifierAlt:I

    .line 636
    sput p5, Lorg/chromium/content/browser/input/ImeAdapter;->sModifierCtrl:I

    .line 637
    sput p6, Lorg/chromium/content/browser/input/ImeAdapter;->sModifierCapsLockOn:I

    .line 638
    sput p7, Lorg/chromium/content/browser/input/ImeAdapter;->sModifierNumLockOn:I

    .line 639
    return-void
.end method

.method private static isTextInputType(I)Z
    .locals 1
    .param p0, "type"    # I

    .prologue
    .line 326
    sget v0, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeNone:I

    if-eq p0, v0, :cond_0

    invoke-static {p0}, Lorg/chromium/ui/picker/InputDialogContainer;->isDialogInputType(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static native nativeAppendBackgroundColorSpan(JIII)V
.end method

.method private static native nativeAppendUnderlineSpan(JII)V
.end method

.method private native nativeAttachImeAdapter(J)V
.end method

.method private native nativeCommitText(JLjava/lang/String;)V
.end method

.method private native nativeCopy(J)V
.end method

.method private native nativeCut(J)V
.end method

.method private native nativeDeleteSurroundingText(JII)V
.end method

.method private native nativeFinishComposingText(J)V
.end method

.method private native nativePaste(J)V
.end method

.method private native nativeResetImeAdapter(J)V
.end method

.method private native nativeSelectAll(J)V
.end method

.method private native nativeSendKeyEvent(JLandroid/view/KeyEvent;IIJIZI)Z
.end method

.method private native nativeSendSyntheticKeyEvent(JIJIII)Z
.end method

.method private native nativeSetComposingRegion(JII)V
.end method

.method private native nativeSetComposingText(JLjava/lang/CharSequence;Ljava/lang/String;I)V
.end method

.method private native nativeSetEditableSelectionOffsets(JII)V
.end method

.method private native nativeUnselect(J)V
.end method

.method private populateUnderlinesFromSpans(Ljava/lang/CharSequence;J)V
    .locals 10
    .param p1, "text"    # Ljava/lang/CharSequence;
    .param p2, "underlines"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 678
    instance-of v6, p1, Landroid/text/SpannableString;

    if-nez v6, :cond_1

    .line 693
    :cond_0
    return-void

    :cond_1
    move-object v4, p1

    .line 680
    check-cast v4, Landroid/text/SpannableString;

    .line 681
    .local v4, "spannableString":Landroid/text/SpannableString;
    const/4 v6, 0x0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    const-class v8, Landroid/text/style/CharacterStyle;

    invoke-virtual {v4, v6, v7, v8}, Landroid/text/SpannableString;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Landroid/text/style/CharacterStyle;

    .line 683
    .local v5, "spans":[Landroid/text/style/CharacterStyle;
    move-object v0, v5

    .local v0, "arr$":[Landroid/text/style/CharacterStyle;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    .line 684
    .local v3, "span":Landroid/text/style/CharacterStyle;
    instance-of v6, v3, Landroid/text/style/BackgroundColorSpan;

    if-eqz v6, :cond_3

    .line 685
    invoke-virtual {v4, v3}, Landroid/text/SpannableString;->getSpanStart(Ljava/lang/Object;)I

    move-result v6

    invoke-virtual {v4, v3}, Landroid/text/SpannableString;->getSpanEnd(Ljava/lang/Object;)I

    move-result v7

    check-cast v3, Landroid/text/style/BackgroundColorSpan;

    .end local v3    # "span":Landroid/text/style/CharacterStyle;
    invoke-virtual {v3}, Landroid/text/style/BackgroundColorSpan;->getBackgroundColor()I

    move-result v8

    invoke-static {p2, p3, v6, v7, v8}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeAppendBackgroundColorSpan(JIII)V

    .line 683
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 688
    .restart local v3    # "span":Landroid/text/style/CharacterStyle;
    :cond_3
    instance-of v6, v3, Landroid/text/style/UnderlineSpan;

    if-eqz v6, :cond_2

    .line 689
    invoke-virtual {v4, v3}, Landroid/text/SpannableString;->getSpanStart(Ljava/lang/Object;)I

    move-result v6

    invoke-virtual {v4, v3}, Landroid/text/SpannableString;->getSpanEnd(Ljava/lang/Object;)I

    move-result v7

    invoke-static {p2, p3, v6, v7}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeAppendUnderlineSpan(JII)V

    goto :goto_1
.end method

.method private shouldSendKeyEventWithKeyCode(Ljava/lang/String;)I
    .locals 3
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    const/16 v0, 0xe5

    .line 345
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    .line 349
    :cond_0
    :goto_0
    return v0

    .line 347
    :cond_1
    const-string v1, "\n"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v0, 0x42

    goto :goto_0

    .line 348
    :cond_2
    const-string v1, "\t"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v0, 0x3d

    goto :goto_0
.end method

.method private showKeyboard()V
    .locals 4

    .prologue
    .line 306
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mIsShowWithoutHideOutstanding:Z

    .line 307
    iget-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mInputMethodManagerWrapper:Lorg/chromium/content/browser/input/InputMethodManagerWrapper;

    iget-object v1, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mViewEmbedder:Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;

    invoke-interface {v1}, Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;->getAttachedView()Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mViewEmbedder:Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;

    invoke-interface {v3}, Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;->getNewShowKeyboardReceiver()Landroid/os/ResultReceiver;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lorg/chromium/content/browser/input/InputMethodManagerWrapper;->showSoftInput(Landroid/view/View;ILandroid/os/ResultReceiver;)V

    .line 309
    return-void
.end method


# virtual methods
.method public attach(J)V
    .locals 3
    .param p1, "nativeImeAdapter"    # J

    .prologue
    .line 302
    sget v0, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeNone:I

    sget v1, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputFlagNone:I

    invoke-virtual {p0, p1, p2, v0, v1}, Lorg/chromium/content/browser/input/ImeAdapter;->attach(JII)V

    .line 303
    return-void
.end method

.method public attach(JII)V
    .locals 5
    .param p1, "nativeImeAdapter"    # J
    .param p3, "textInputType"    # I
    .param p4, "textInputFlags"    # I

    .prologue
    const-wide/16 v2, 0x0

    .line 281
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 282
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeResetImeAdapter(J)V

    .line 284
    :cond_0
    iput-wide p1, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    .line 285
    iput p3, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mTextInputType:I

    .line 286
    iput p4, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mTextInputFlags:I

    .line 287
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mLastComposeText:Ljava/lang/String;

    .line 288
    cmp-long v0, p1, v2

    if-eqz v0, :cond_1

    .line 289
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeAttachImeAdapter(J)V

    .line 291
    :cond_1
    iget v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mTextInputType:I

    sget v1, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeNone:I

    if-ne v0, v1, :cond_2

    .line 292
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/chromium/content/browser/input/ImeAdapter;->dismissInput(Z)V

    .line 294
    :cond_2
    return-void
.end method

.method checkCompositionQueueAndCallNative(Ljava/lang/CharSequence;IZ)Z
    .locals 18
    .param p1, "text"    # Ljava/lang/CharSequence;
    .param p2, "newCursorPosition"    # I
    .param p3, "isCommit"    # Z

    .prologue
    .line 422
    move-object/from16 v0, p0

    iget-wide v2, v0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    const/4 v2, 0x0

    .line 493
    :goto_0
    return v2

    .line 423
    :cond_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/chromium/content/browser/input/ImeAdapter;->mViewEmbedder:Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;

    invoke-interface {v2}, Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;->onImeEvent()V

    .line 425
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v15

    .line 426
    .local v15, "textStr":Ljava/lang/String;
    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lorg/chromium/content/browser/input/ImeAdapter;->shouldSendKeyEventWithKeyCode(Ljava/lang/String;)I

    move-result v8

    .line 427
    .local v8, "keyCode":I
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    .line 429
    .local v6, "timeStampMs":J
    const/16 v2, 0xe5

    if-eq v8, v2, :cond_1

    .line 430
    const/4 v2, 0x6

    move-object/from16 v0, p0

    invoke-virtual {v0, v8, v2}, Lorg/chromium/content/browser/input/ImeAdapter;->sendKeyEventWithKeyCode(II)V

    .line 492
    :goto_1
    move-object/from16 v0, p0

    iput-object v15, v0, Lorg/chromium/content/browser/input/ImeAdapter;->mLastComposeText:Ljava/lang/String;

    .line 493
    const/4 v2, 0x1

    goto :goto_0

    .line 433
    :cond_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/chromium/content/browser/input/ImeAdapter;->mLastComposeText:Ljava/lang/String;

    invoke-static {v2, v15}, Lorg/chromium/content/browser/input/ImeAdapter;->getTypedKeyEventGuess(Ljava/lang/String;Ljava/lang/String;)Landroid/view/KeyEvent;

    move-result-object v17

    .line 434
    .local v17, "keyEvent":Landroid/view/KeyEvent;
    const/4 v9, 0x0

    .line 435
    .local v9, "modifiers":I
    if-eqz v17, :cond_2

    .line 436
    invoke-virtual/range {v17 .. v17}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v8

    .line 437
    invoke-virtual/range {v17 .. v17}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v2

    invoke-static {v2}, Lorg/chromium/content/browser/input/ImeAdapter;->getModifiers(I)I

    move-result v9

    .line 447
    :goto_2
    if-lez v8, :cond_5

    if-eqz p3, :cond_5

    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/chromium/content/browser/input/ImeAdapter;->mLastComposeText:Ljava/lang/String;

    if-nez v2, :cond_5

    .line 448
    move-object/from16 v0, p0

    iput v8, v0, Lorg/chromium/content/browser/input/ImeAdapter;->mLastSyntheticKeyCode:I

    .line 449
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/chromium/content/browser/input/ImeAdapter;->translateAndSendNativeEvents(Landroid/view/KeyEvent;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, 0x1

    move-object/from16 v0, v17

    invoke-static {v0, v2}, Landroid/view/KeyEvent;->changeAction(Landroid/view/KeyEvent;I)Landroid/view/KeyEvent;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lorg/chromium/content/browser/input/ImeAdapter;->translateAndSendNativeEvents(Landroid/view/KeyEvent;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, 0x1

    goto :goto_0

    .line 438
    :cond_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/chromium/content/browser/input/ImeAdapter;->mLastComposeText:Ljava/lang/String;

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 439
    const/4 v8, 0x0

    goto :goto_2

    .line 441
    :cond_3
    const/4 v8, -0x1

    goto :goto_2

    .line 449
    :cond_4
    const/4 v2, 0x0

    goto :goto_0

    .line 472
    :cond_5
    if-ltz v8, :cond_6

    .line 473
    move-object/from16 v0, p0

    iget-wide v3, v0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    sget v5, Lorg/chromium/content/browser/input/ImeAdapter;->sEventTypeRawKeyDown:I

    const/4 v10, 0x0

    move-object/from16 v2, p0

    invoke-direct/range {v2 .. v10}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeSendSyntheticKeyEvent(JIJIII)Z

    .line 477
    :cond_6
    if-eqz p3, :cond_8

    .line 478
    move-object/from16 v0, p0

    iget-wide v2, v0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3, v15}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeCommitText(JLjava/lang/String;)V

    .line 479
    const/4 v15, 0x0

    .line 484
    :goto_3
    if-ltz v8, :cond_7

    .line 485
    move-object/from16 v0, p0

    iget-wide v3, v0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    sget v5, Lorg/chromium/content/browser/input/ImeAdapter;->sEventTypeKeyUp:I

    const/4 v10, 0x0

    move-object/from16 v2, p0

    invoke-direct/range {v2 .. v10}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeSendSyntheticKeyEvent(JIJIII)Z

    .line 489
    :cond_7
    move-object/from16 v0, p0

    iput v8, v0, Lorg/chromium/content/browser/input/ImeAdapter;->mLastSyntheticKeyCode:I

    goto/16 :goto_1

    .line 481
    :cond_8
    move-object/from16 v0, p0

    iget-wide v12, v0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    move-object/from16 v11, p0

    move-object/from16 v14, p1

    move/from16 v16, p2

    invoke-direct/range {v11 .. v16}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeSetComposingText(JLjava/lang/CharSequence;Ljava/lang/String;I)V

    goto :goto_3
.end method

.method public copy()Z
    .locals 4

    .prologue
    .line 610
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 612
    :goto_0
    return v0

    .line 611
    :cond_0
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeCopy(J)V

    .line 612
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public cut()Z
    .locals 4

    .prologue
    .line 600
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 602
    :goto_0
    return v0

    .line 601
    :cond_0
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeCut(J)V

    .line 602
    const/4 v0, 0x1

    goto :goto_0
.end method

.method deleteSurroundingText(II)Z
    .locals 4
    .param p1, "beforeLength"    # I
    .param p2, "afterLength"    # I

    .prologue
    .line 544
    iget-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mViewEmbedder:Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;

    invoke-interface {v0}, Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;->onImeEvent()V

    .line 545
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 547
    :goto_0
    return v0

    .line 546
    :cond_0
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeDeleteSurroundingText(JII)V

    .line 547
    const/4 v0, 0x1

    goto :goto_0
.end method

.method detach()V
    .locals 2
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 703
    iget-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mDismissInput:Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;

    if-eqz v0, :cond_0

    .line 704
    iget-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mDismissInput:Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 705
    iget-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mDismissInput:Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;->detach()V

    .line 707
    :cond_0
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    .line 708
    const/4 v0, 0x0

    iput v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mTextInputType:I

    .line 709
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 341
    invoke-virtual {p0, p1}, Lorg/chromium/content/browser/input/ImeAdapter;->translateAndSendNativeEvents(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method finishComposingText()V
    .locals 4

    .prologue
    .line 497
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mLastComposeText:Ljava/lang/String;

    .line 498
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 500
    :goto_0
    return-void

    .line 499
    :cond_0
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeFinishComposingText(J)V

    goto :goto_0
.end method

.method getInputMethodManagerWrapper()Lorg/chromium/content/browser/input/InputMethodManagerWrapper;
    .locals 1

    .prologue
    .line 189
    iget-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mInputMethodManagerWrapper:Lorg/chromium/content/browser/input/InputMethodManagerWrapper;

    return-object v0
.end method

.method getTextInputFlags()I
    .locals 1

    .prologue
    .line 214
    iget v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mTextInputFlags:I

    return v0
.end method

.method getTextInputType()I
    .locals 1

    .prologue
    .line 206
    iget v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mTextInputType:I

    return v0
.end method

.method public hasTextInputType()Z
    .locals 1

    .prologue
    .line 330
    iget v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mTextInputType:I

    invoke-static {v0}, Lorg/chromium/content/browser/input/ImeAdapter;->isTextInputType(I)Z

    move-result v0

    return v0
.end method

.method public isSelectionPassword()Z
    .locals 2

    .prologue
    .line 337
    iget v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mTextInputType:I

    sget v1, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypePassword:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public paste()Z
    .locals 4

    .prologue
    .line 620
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 622
    :goto_0
    return v0

    .line 621
    :cond_0
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/input/ImeAdapter;->nativePaste(J)V

    .line 622
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public selectAll()Z
    .locals 4

    .prologue
    .line 590
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 592
    :goto_0
    return v0

    .line 591
    :cond_0
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeSelectAll(J)V

    .line 592
    const/4 v0, 0x1

    goto :goto_0
.end method

.method sendKeyEventWithKeyCode(II)V
    .locals 19
    .param p1, "keyCode"    # I
    .param p2, "flags"    # I

    .prologue
    .line 405
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    .line 406
    .local v4, "eventTime":J
    move/from16 v0, p1

    move-object/from16 v1, p0

    iput v0, v1, Lorg/chromium/content/browser/input/ImeAdapter;->mLastSyntheticKeyCode:I

    .line 407
    new-instance v3, Landroid/view/KeyEvent;

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, -0x1

    const/4 v13, 0x0

    move-wide v6, v4

    move/from16 v9, p1

    move/from16 v14, p2

    invoke-direct/range {v3 .. v14}, Landroid/view/KeyEvent;-><init>(JJIIIIIII)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lorg/chromium/content/browser/input/ImeAdapter;->translateAndSendNativeEvents(Landroid/view/KeyEvent;)Z

    .line 411
    new-instance v7, Landroid/view/KeyEvent;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v8

    const/4 v12, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, -0x1

    const/16 v17, 0x0

    move-wide v10, v4

    move/from16 v13, p1

    move/from16 v18, p2

    invoke-direct/range {v7 .. v18}, Landroid/view/KeyEvent;-><init>(JJIIIIIII)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lorg/chromium/content/browser/input/ImeAdapter;->translateAndSendNativeEvents(Landroid/view/KeyEvent;)Z

    .line 415
    return-void
.end method

.method sendSyntheticKeyEvent(IJIII)Z
    .locals 10
    .param p1, "eventType"    # I
    .param p2, "timestampMs"    # J
    .param p4, "keyCode"    # I
    .param p5, "modifiers"    # I
    .param p6, "unicodeChar"    # I

    .prologue
    .line 528
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 532
    :goto_0
    return v0

    .line 530
    :cond_0
    iget-wide v1, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    move-object v0, p0

    move v3, p1

    move-wide v4, p2

    move v6, p4

    move v7, p5

    move/from16 v8, p6

    invoke-direct/range {v0 .. v8}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeSendSyntheticKeyEvent(JIJIII)Z

    .line 532
    const/4 v0, 0x1

    goto :goto_0
.end method

.method setComposingRegion(Ljava/lang/CharSequence;II)Z
    .locals 4
    .param p1, "text"    # Ljava/lang/CharSequence;
    .param p2, "start"    # I
    .param p3, "end"    # I

    .prologue
    .line 569
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 572
    :goto_0
    return v0

    .line 570
    :cond_0
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    invoke-direct {p0, v0, v1, p2, p3}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeSetComposingRegion(JII)V

    .line 571
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mLastComposeText:Ljava/lang/String;

    .line 572
    const/4 v0, 0x1

    goto :goto_0

    .line 571
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method setEditableSelectionOffsets(II)Z
    .locals 4
    .param p1, "start"    # I
    .param p2, "end"    # I

    .prologue
    .line 557
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 559
    :goto_0
    return v0

    .line 558
    :cond_0
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeSetEditableSelectionOffsets(JII)V

    .line 559
    const/4 v0, 0x1

    goto :goto_0
.end method

.method setInputConnection(Lorg/chromium/content/browser/input/AdapterInputConnection;)V
    .locals 1
    .param p1, "inputConnection"    # Lorg/chromium/content/browser/input/AdapterInputConnection;

    .prologue
    .line 197
    iput-object p1, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mInputConnection:Lorg/chromium/content/browser/input/AdapterInputConnection;

    .line 198
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mLastComposeText:Ljava/lang/String;

    .line 199
    return-void
.end method

.method public setInputMethodManagerWrapper(Lorg/chromium/content/browser/input/InputMethodManagerWrapper;)V
    .locals 0
    .param p1, "immw"    # Lorg/chromium/content/browser/input/InputMethodManagerWrapper;
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    .line 180
    iput-object p1, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mInputMethodManagerWrapper:Lorg/chromium/content/browser/input/InputMethodManagerWrapper;

    .line 181
    return-void
.end method

.method translateAndSendNativeEvents(Landroid/view/KeyEvent;)Z
    .locals 12
    .param p1, "event"    # Landroid/view/KeyEvent;

    .prologue
    const/4 v9, 0x0

    .line 503
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 521
    :cond_0
    :goto_0
    return v9

    .line 505
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v11

    .line 506
    .local v11, "action":I
    if-eqz v11, :cond_2

    const/4 v0, 0x1

    if-ne v11, v0, :cond_0

    .line 520
    :cond_2
    iget-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mViewEmbedder:Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;

    invoke-interface {v0}, Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;->onImeEvent()V

    .line 521
    iget-wide v1, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v0

    invoke-static {v0}, Lorg/chromium/content/browser/input/ImeAdapter;->getModifiers(I)I

    move-result v5

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getEventTime()J

    move-result-wide v6

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v8

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v10

    move-object v0, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v10}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeSendKeyEvent(JLandroid/view/KeyEvent;IIJIZI)Z

    move-result v9

    goto :goto_0
.end method

.method public unselect()Z
    .locals 4

    .prologue
    .line 580
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 582
    :goto_0
    return v0

    .line 581
    :cond_0
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/input/ImeAdapter;->nativeUnselect(J)V

    .line 582
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public updateKeyboardVisibility(JIIZ)V
    .locals 5
    .param p1, "nativeImeAdapter"    # J
    .param p3, "textInputType"    # I
    .param p4, "textInputFlags"    # I
    .param p5, "showIfNeeded"    # Z

    .prologue
    .line 252
    iget-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mDismissInput:Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 256
    iget v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mTextInputType:I

    sget v1, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeNone:I

    if-ne v0, v1, :cond_1

    if-nez p5, :cond_1

    .line 278
    :cond_0
    :goto_0
    return-void

    .line 260
    :cond_1
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mNativeImeAdapterAndroid:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_2

    iget v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mTextInputType:I

    if-eq v0, p3, :cond_4

    .line 263
    :cond_2
    sget v0, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeNone:I

    if-ne p3, v0, :cond_3

    .line 264
    new-instance v0, Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;

    invoke-direct {v0, p0, p1, p2}, Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;-><init>(Lorg/chromium/content/browser/input/ImeAdapter;J)V

    iput-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mDismissInput:Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;

    .line 265
    iget-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mDismissInput:Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 269
    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/chromium/content/browser/input/ImeAdapter;->attach(JII)V

    .line 271
    iget-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mInputMethodManagerWrapper:Lorg/chromium/content/browser/input/InputMethodManagerWrapper;

    iget-object v1, p0, Lorg/chromium/content/browser/input/ImeAdapter;->mViewEmbedder:Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;

    invoke-interface {v1}, Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;->getAttachedView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/chromium/content/browser/input/InputMethodManagerWrapper;->restartInput(Landroid/view/View;)V

    .line 272
    if-eqz p5, :cond_0

    .line 273
    invoke-direct {p0}, Lorg/chromium/content/browser/input/ImeAdapter;->showKeyboard()V

    goto :goto_0

    .line 275
    :cond_4
    invoke-direct {p0}, Lorg/chromium/content/browser/input/ImeAdapter;->hasInputType()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p5, :cond_0

    .line 276
    invoke-direct {p0}, Lorg/chromium/content/browser/input/ImeAdapter;->showKeyboard()V

    goto :goto_0
.end method
