.class final enum Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;
.super Ljava/lang/Enum;
.source "BaseLockPatternActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "InvalidPattern"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

.field public static final enum Inv_L_Pattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

.field public static final enum L_Pattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

.field public static final enum Z_Pattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;


# instance fields
.field public patternVal:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 114
    new-instance v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    const-string v1, "Z_Pattern"

    const-string v2, "1235789"

    invoke-direct {v0, v1, v3, v2}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->Z_Pattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    .line 118
    new-instance v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    const-string v1, "L_Pattern"

    const-string v2, "14789"

    invoke-direct {v0, v1, v4, v2}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->L_Pattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    .line 122
    new-instance v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    const-string v1, "Inv_L_Pattern"

    const-string v2, "12369"

    invoke-direct {v0, v1, v5, v2}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->Inv_L_Pattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    .line 109
    const/4 v0, 0x3

    new-array v0, v0, [Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    sget-object v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->Z_Pattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    aput-object v1, v0, v3

    sget-object v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->L_Pattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    aput-object v1, v0, v4

    sget-object v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->Inv_L_Pattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    aput-object v1, v0, v5

    sput-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->$VALUES:[Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p3, "patternVal"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 146
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 147
    iput-object p3, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->patternVal:Ljava/lang/String;

    .line 148
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 109
    const-class v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    return-object v0
.end method

.method public static values()[Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;
    .locals 1

    .prologue
    .line 109
    sget-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->$VALUES:[Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    invoke-virtual {v0}, [Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    return-object v0
.end method


# virtual methods
.method public getPatternReverseVal()Ljava/lang/String;
    .locals 2

    .prologue
    .line 139
    new-instance v0, Ljava/lang/StringBuffer;

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->patternVal:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->reverse()Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPatternVal()Ljava/lang/String;
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->patternVal:Ljava/lang/String;

    return-object v0
.end method
