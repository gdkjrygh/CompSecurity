.class public Lcom/facebook/orca/contacts/picker/o;
.super Ljava/lang/Object;
.source "ContactPickerConstants.java"


# static fields
.field public static final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 13
    const/16 v0, 0xf

    const/16 v1, 0x14

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    sput v0, Lcom/facebook/orca/contacts/picker/o;->a:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
