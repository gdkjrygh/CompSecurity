.class synthetic Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$7;
.super Ljava/lang/Object;
.source "BaseLockPatternActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$group$pals$android$lib$ui$lockpattern$BaseLockPatternActivity$LPMode:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 337
    invoke-static {}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->values()[Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$7;->$SwitchMap$group$pals$android$lib$ui$lockpattern$BaseLockPatternActivity$LPMode:[I

    :try_start_0
    sget-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$7;->$SwitchMap$group$pals$android$lib$ui$lockpattern$BaseLockPatternActivity$LPMode:[I

    sget-object v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->CreatePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    invoke-virtual {v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    :try_start_1
    sget-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$7;->$SwitchMap$group$pals$android$lib$ui$lockpattern$BaseLockPatternActivity$LPMode:[I

    sget-object v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->ComparePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    invoke-virtual {v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method
