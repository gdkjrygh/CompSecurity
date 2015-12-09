.class Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;
.super Landroid/view/View$BaseSavedState;
.source "LockPatternView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mDisplayMode:I

.field private final mInStealthMode:Z

.field private final mInputEnabled:Z

.field private final mSerializedPattern:Ljava/lang/String;

.field private final mTactileFeedbackEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 1306
    new-instance v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState$1;

    invoke-direct {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState$1;-><init>()V

    sput-object v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    const/4 v1, 0x0

    .line 1268
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 1269
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mSerializedPattern:Ljava/lang/String;

    .line 1270
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mDisplayMode:I

    .line 1271
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mInputEnabled:Z

    .line 1272
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mInStealthMode:Z

    .line 1273
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mTactileFeedbackEnabled:Z

    .line 1274
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$1;)V
    .locals 0
    .param p1, "x0"    # Landroid/os/Parcel;
    .param p2, "x1"    # Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$1;

    .prologue
    .line 1243
    invoke-direct {p0, p1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcelable;Ljava/lang/String;IZZZ)V
    .locals 0
    .param p1, "superState"    # Landroid/os/Parcelable;
    .param p2, "serializedPattern"    # Ljava/lang/String;
    .param p3, "displayMode"    # I
    .param p4, "inputEnabled"    # Z
    .param p5, "inStealthMode"    # Z
    .param p6, "tactileFeedbackEnabled"    # Z

    .prologue
    .line 1256
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1257
    iput-object p2, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mSerializedPattern:Ljava/lang/String;

    .line 1258
    iput p3, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mDisplayMode:I

    .line 1259
    iput-boolean p4, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mInputEnabled:Z

    .line 1260
    iput-boolean p5, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mInStealthMode:Z

    .line 1261
    iput-boolean p6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mTactileFeedbackEnabled:Z

    .line 1262
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcelable;Ljava/lang/String;IZZZLgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$1;)V
    .locals 0
    .param p1, "x0"    # Landroid/os/Parcelable;
    .param p2, "x1"    # Ljava/lang/String;
    .param p3, "x2"    # I
    .param p4, "x3"    # Z
    .param p5, "x4"    # Z
    .param p6, "x5"    # Z
    .param p7, "x6"    # Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$1;

    .prologue
    .line 1243
    invoke-direct/range {p0 .. p6}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;-><init>(Landroid/os/Parcelable;Ljava/lang/String;IZZZ)V

    return-void
.end method


# virtual methods
.method public getDisplayMode()I
    .locals 1

    .prologue
    .line 1281
    iget v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mDisplayMode:I

    return v0
.end method

.method public getSerializedPattern()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1277
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mSerializedPattern:Ljava/lang/String;

    return-object v0
.end method

.method public isInStealthMode()Z
    .locals 1

    .prologue
    .line 1289
    iget-boolean v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mInStealthMode:Z

    return v0
.end method

.method public isInputEnabled()Z
    .locals 1

    .prologue
    .line 1285
    iget-boolean v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mInputEnabled:Z

    return v0
.end method

.method public isTactileFeedbackEnabled()Z
    .locals 1

    .prologue
    .line 1293
    iget-boolean v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mTactileFeedbackEnabled:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 1298
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 1299
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mSerializedPattern:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1300
    iget v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mDisplayMode:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1301
    iget-boolean v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mInputEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 1302
    iget-boolean v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mInStealthMode:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 1303
    iget-boolean v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->mTactileFeedbackEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 1304
    return-void
.end method
