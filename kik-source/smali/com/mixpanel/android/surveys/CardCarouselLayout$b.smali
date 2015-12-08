.class public final Lcom/mixpanel/android/surveys/CardCarouselLayout$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/surveys/CardCarouselLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum a:I

.field public static final enum b:I

.field private static final synthetic c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v0, 0x2

    const/4 v3, 0x1

    .line 53
    sput v3, Lcom/mixpanel/android/surveys/CardCarouselLayout$b;->a:I

    sput v0, Lcom/mixpanel/android/surveys/CardCarouselLayout$b;->b:I

    .line 52
    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lcom/mixpanel/android/surveys/CardCarouselLayout$b;->a:I

    aput v2, v0, v1

    sget v1, Lcom/mixpanel/android/surveys/CardCarouselLayout$b;->b:I

    aput v1, v0, v3

    sput-object v0, Lcom/mixpanel/android/surveys/CardCarouselLayout$b;->c:[I

    return-void
.end method

.method public static a()[I
    .locals 1

    .prologue
    .line 52
    sget-object v0, Lcom/mixpanel/android/surveys/CardCarouselLayout$b;->c:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method
