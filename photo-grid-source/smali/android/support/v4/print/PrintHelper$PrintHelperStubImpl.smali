.class final Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;


# instance fields
.field mColorMode:I

.field mOrientation:I

.field mScaleMode:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x2

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    iput v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mScaleMode:I

    .line 116
    iput v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mColorMode:I

    .line 117
    const/4 v0, 0x1

    iput v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mOrientation:I

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v4/print/PrintHelper$1;)V
    .locals 0

    .prologue
    .line 114
    invoke-direct {p0}, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;-><init>()V

    return-void
.end method


# virtual methods
.method public final getColorMode()I
    .locals 1

    .prologue
    .line 125
    iget v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mColorMode:I

    return v0
.end method

.method public final getOrientation()I
    .locals 1

    .prologue
    .line 137
    iget v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mOrientation:I

    return v0
.end method

.method public final getScaleMode()I
    .locals 1

    .prologue
    .line 141
    iget v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mScaleMode:I

    return v0
.end method

.method public final printBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/support/v4/print/PrintHelper$OnPrintFinishCallback;)V
    .locals 0

    .prologue
    .line 146
    return-void
.end method

.method public final printBitmap(Ljava/lang/String;Landroid/net/Uri;Landroid/support/v4/print/PrintHelper$OnPrintFinishCallback;)V
    .locals 0

    .prologue
    .line 150
    return-void
.end method

.method public final setColorMode(I)V
    .locals 0

    .prologue
    .line 130
    iput p1, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mColorMode:I

    .line 131
    return-void
.end method

.method public final setOrientation(I)V
    .locals 0

    .prologue
    .line 134
    iput p1, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mOrientation:I

    return-void
.end method

.method public final setScaleMode(I)V
    .locals 0

    .prologue
    .line 120
    iput p1, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mScaleMode:I

    .line 121
    return-void
.end method
