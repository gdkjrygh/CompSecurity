.class public Lyuku/ambilwarna/widget/AmbilWarnaPreference;
.super Landroid/preference/Preference;
.source "AmbilWarnaPreference.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyuku/ambilwarna/widget/AmbilWarnaPreference$SavedState;
    }
.end annotation


# instance fields
.field private final supportsAlpha:Z

.field value:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 19
    invoke-direct {p0, p1, p2}, Landroid/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 21
    sget-object v1, Lyuku/ambilwarna/R$styleable;->AmbilWarnaPreference:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 22
    .local v0, "ta":Landroid/content/res/TypedArray;
    sget v1, Lyuku/ambilwarna/R$styleable;->AmbilWarnaPreference_supportsAlpha:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->supportsAlpha:Z

    .line 24
    sget v1, Lyuku/ambilwarna/R$layout;->ambilwarna_pref_widget:I

    invoke-virtual {p0, v1}, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->setWidgetLayoutResource(I)V

    .line 25
    return-void
.end method

.method static synthetic access$0(Lyuku/ambilwarna/widget/AmbilWarnaPreference;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->callChangeListener(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$1(Lyuku/ambilwarna/widget/AmbilWarnaPreference;I)Z
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->persistInt(I)Z

    move-result v0

    return v0
.end method

.method static synthetic access$2(Lyuku/ambilwarna/widget/AmbilWarnaPreference;)V
    .locals 0

    .prologue
    .line 1
    invoke-virtual {p0}, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->notifyChanged()V

    return-void
.end method


# virtual methods
.method public forceSetValue(I)V
    .locals 0
    .param p1, "value"    # I

    .prologue
    .line 53
    iput p1, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->value:I

    .line 54
    invoke-virtual {p0, p1}, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->persistInt(I)Z

    .line 55
    invoke-virtual {p0}, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->notifyChanged()V

    .line 56
    return-void
.end method

.method protected onBindView(Landroid/view/View;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 28
    invoke-super {p0, p1}, Landroid/preference/Preference;->onBindView(Landroid/view/View;)V

    .line 31
    sget v1, Lyuku/ambilwarna/R$id;->ambilwarna_pref_widget_box:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 32
    .local v0, "box":Landroid/view/View;
    if-eqz v0, :cond_0

    .line 33
    iget v1, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 35
    :cond_0
    return-void
.end method

.method protected onClick()V
    .locals 5

    .prologue
    .line 38
    new-instance v0, Lyuku/ambilwarna/AmbilWarnaDialog;

    invoke-virtual {p0}, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->value:I

    iget-boolean v3, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->supportsAlpha:Z

    new-instance v4, Lyuku/ambilwarna/widget/AmbilWarnaPreference$1;

    invoke-direct {v4, p0}, Lyuku/ambilwarna/widget/AmbilWarnaPreference$1;-><init>(Lyuku/ambilwarna/widget/AmbilWarnaPreference;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lyuku/ambilwarna/AmbilWarnaDialog;-><init>(Landroid/content/Context;IZLyuku/ambilwarna/AmbilWarnaDialog$OnAmbilWarnaListener;)V

    .line 49
    invoke-virtual {v0}, Lyuku/ambilwarna/AmbilWarnaDialog;->show()V

    .line 50
    return-void
.end method

.method protected onGetDefaultValue(Landroid/content/res/TypedArray;I)Ljava/lang/Object;
    .locals 1
    .param p1, "a"    # Landroid/content/res/TypedArray;
    .param p2, "index"    # I

    .prologue
    .line 60
    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 3
    .param p1, "state"    # Landroid/os/Parcelable;

    .prologue
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lyuku/ambilwarna/widget/AmbilWarnaPreference$SavedState;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 90
    invoke-super {p0, p1}, Landroid/preference/Preference;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 99
    :goto_0
    return-void

    :cond_0
    move-object v0, p1

    .line 95
    check-cast v0, Lyuku/ambilwarna/widget/AmbilWarnaPreference$SavedState;

    .line 96
    .local v0, "myState":Lyuku/ambilwarna/widget/AmbilWarnaPreference$SavedState;
    invoke-virtual {v0}, Lyuku/ambilwarna/widget/AmbilWarnaPreference$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-super {p0, v1}, Landroid/preference/Preference;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 97
    iget v1, v0, Lyuku/ambilwarna/widget/AmbilWarnaPreference$SavedState;->value:I

    iput v1, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->value:I

    .line 98
    invoke-virtual {p0}, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->notifyChanged()V

    goto :goto_0
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .prologue
    .line 79
    invoke-super {p0}, Landroid/preference/Preference;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    .line 80
    .local v1, "superState":Landroid/os/Parcelable;
    invoke-virtual {p0}, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->isPersistent()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 84
    .end local v1    # "superState":Landroid/os/Parcelable;
    :goto_0
    return-object v1

    .line 82
    .restart local v1    # "superState":Landroid/os/Parcelable;
    :cond_0
    new-instance v0, Lyuku/ambilwarna/widget/AmbilWarnaPreference$SavedState;

    invoke-direct {v0, v1}, Lyuku/ambilwarna/widget/AmbilWarnaPreference$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 83
    .local v0, "myState":Lyuku/ambilwarna/widget/AmbilWarnaPreference$SavedState;
    iget v2, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->value:I

    iput v2, v0, Lyuku/ambilwarna/widget/AmbilWarnaPreference$SavedState;->value:I

    move-object v1, v0

    .line 84
    goto :goto_0
.end method

.method protected onSetInitialValue(ZLjava/lang/Object;)V
    .locals 2
    .param p1, "restoreValue"    # Z
    .param p2, "defaultValue"    # Ljava/lang/Object;

    .prologue
    .line 64
    if-eqz p1, :cond_0

    .line 65
    iget v1, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->value:I

    invoke-virtual {p0, v1}, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->getPersistedInt(I)I

    move-result v1

    iput v1, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->value:I

    .line 71
    .end local p2    # "defaultValue":Ljava/lang/Object;
    :goto_0
    return-void

    .line 67
    .restart local p2    # "defaultValue":Ljava/lang/Object;
    :cond_0
    check-cast p2, Ljava/lang/Integer;

    .end local p2    # "defaultValue":Ljava/lang/Object;
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 68
    .local v0, "value":I
    iput v0, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->value:I

    .line 69
    invoke-virtual {p0, v0}, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->persistInt(I)Z

    goto :goto_0
.end method
