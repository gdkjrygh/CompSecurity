.class public Lcom/scannerfire/model/Mail;
.super Ljava/lang/Object;
.source "Mail.java"


# static fields
.field private static email:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getMailFromString(Ljava/lang/String;)Lcom/scannerfire/model/Mail;
    .locals 2
    .param p0, "string"    # Ljava/lang/String;

    .prologue
    .line 8
    new-instance v0, Lcom/scannerfire/model/Mail;

    invoke-direct {v0}, Lcom/scannerfire/model/Mail;-><init>()V

    .line 9
    .local v0, "msg":Lcom/scannerfire/model/Mail;
    const-string v1, "mailto:"

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 10
    const/4 v1, 0x7

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/scannerfire/model/Mail;->email:Ljava/lang/String;

    .line 12
    :cond_0
    return-object v0
.end method

.method public static getString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 16
    sget-object v0, Lcom/scannerfire/model/Mail;->email:Ljava/lang/String;

    return-object v0
.end method
