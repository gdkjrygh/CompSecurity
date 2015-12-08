.class public final Lkik/android/f/a/ae$a;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/f/a/ae;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .prologue
    .line 100
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 101
    iput p1, p0, Lkik/android/f/a/ae$a;->a:I

    .line 102
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 106
    const v0, 0x7f0900ae

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 108
    iget v1, p0, Lkik/android/f/a/ae$a;->a:I

    packed-switch v1, :pswitch_data_0

    .line 114
    :goto_0
    return-object v0

    .line 110
    :pswitch_0
    const v0, 0x7f090134

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 108
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
