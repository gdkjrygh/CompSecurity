.class public Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;
.super Ljava/lang/Object;
.source "WriteData.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;",
            ">;"
        }
    .end annotation
.end field

.field private static final PROP_SELECTION_END:Ljava/lang/String; = "selectionEnd"

.field private static final PROP_SELECTION_START:Ljava/lang/String; = "selectionStart"


# instance fields
.field private mAccessibilityNodeInfo:Landroid/view/accessibility/AccessibilityNodeInfo;

.field private mProperties:Landroid/os/Bundle;

.field private mText:Ljava/lang/CharSequence;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 143
    new-instance v0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData$1;

    invoke-direct {v0}, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData$1;-><init>()V

    sput-object v0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mProperties:Landroid/os/Bundle;

    .line 177
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    .line 179
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mProperties:Landroid/os/Bundle;

    .line 180
    sget-object v0, Landroid/view/accessibility/AccessibilityNodeInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo;

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mAccessibilityNodeInfo:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 182
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mText:Ljava/lang/CharSequence;

    .line 183
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mProperties:Landroid/os/Bundle;

    .line 184
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/googlecode/eyesfree/braille/selfbraille/WriteData$1;)V
    .locals 0
    .param p1, "x0"    # Landroid/os/Parcel;
    .param p2, "x1"    # Lcom/googlecode/eyesfree/braille/selfbraille/WriteData$1;

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public static forView(Landroid/view/View;)Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;
    .locals 2
    .param p0, "view"    # Landroid/view/View;

    .prologue
    .line 42
    invoke-static {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    .line 43
    .local v0, "node":Landroid/view/accessibility/AccessibilityNodeInfo;
    new-instance v1, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;

    invoke-direct {v1}, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;-><init>()V

    .line 44
    .local v1, "writeData":Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;
    iput-object v0, v1, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mAccessibilityNodeInfo:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 45
    return-object v1
.end method

.method private writableProperties()Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 106
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mProperties:Landroid/os/Bundle;

    sget-object v1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    if-ne v0, v1, :cond_0

    .line 107
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mProperties:Landroid/os/Bundle;

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mProperties:Landroid/os/Bundle;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 158
    const/4 v0, 0x0

    return v0
.end method

.method public getAccessibilityNodeInfo()Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mAccessibilityNodeInfo:Landroid/view/accessibility/AccessibilityNodeInfo;

    return-object v0
.end method

.method public getSelectionEnd()I
    .locals 3

    .prologue
    .line 102
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mProperties:Landroid/os/Bundle;

    const-string v1, "selectionEnd"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getSelectionStart()I
    .locals 3

    .prologue
    .line 81
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mProperties:Landroid/os/Bundle;

    const-string v1, "selectionStart"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mText:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public setSelectionEnd(I)Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;
    .locals 2
    .param p1, "v"    # I

    .prologue
    .line 94
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->writableProperties()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "selectionEnd"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 95
    return-object p0
.end method

.method public setSelectionStart(I)Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;
    .locals 2
    .param p1, "v"    # I

    .prologue
    .line 73
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->writableProperties()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "selectionStart"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 74
    return-object p0
.end method

.method public setText(Ljava/lang/CharSequence;)Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;
    .locals 0
    .param p1, "text"    # Ljava/lang/CharSequence;

    .prologue
    .line 59
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mText:Ljava/lang/CharSequence;

    .line 60
    return-object p0
.end method

.method public validate()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .prologue
    .line 118
    iget-object v3, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mAccessibilityNodeInfo:Landroid/view/accessibility/AccessibilityNodeInfo;

    if-nez v3, :cond_0

    .line 119
    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "Accessibility node info can\'t be null"

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 122
    :cond_0
    invoke-virtual {p0}, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->getSelectionStart()I

    move-result v1

    .line 123
    .local v1, "selectionStart":I
    invoke-virtual {p0}, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->getSelectionEnd()I

    move-result v0

    .line 124
    .local v0, "selectionEnd":I
    iget-object v3, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mText:Ljava/lang/CharSequence;

    if-nez v3, :cond_2

    .line 125
    if-gtz v1, :cond_1

    if-lez v0, :cond_5

    .line 126
    :cond_1
    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "Selection can\'t be set without text"

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 130
    :cond_2
    if-gez v1, :cond_3

    if-ltz v0, :cond_3

    .line 131
    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "Selection end without start"

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 134
    :cond_3
    iget-object v3, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mText:Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v2

    .line 135
    .local v2, "textLength":I
    if-gt v1, v2, :cond_4

    if-le v0, v2, :cond_5

    .line 136
    :cond_4
    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "Selection out of bounds"

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 139
    .end local v2    # "textLength":I
    :cond_5
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 168
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mAccessibilityNodeInfo:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->writeToParcel(Landroid/os/Parcel;I)V

    .line 171
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mAccessibilityNodeInfo:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 172
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mText:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 173
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->mProperties:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 174
    return-void
.end method
