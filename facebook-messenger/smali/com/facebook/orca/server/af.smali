.class public Lcom/facebook/orca/server/af;
.super Ljava/lang/Object;
.source "GetPhoneContactsParamsBuilder.java"


# instance fields
.field private a:I

.field private b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    sget v0, Lcom/facebook/orca/server/GetPhoneContactsParams;->a:I

    iput v0, p0, Lcom/facebook/orca/server/af;->a:I

    .line 11
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/orca/server/af;->b:I

    return-void
.end method
