.class public Lcom/pinterest/pinit/exceptions/ImageException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# static fields
.field public static final MESSAGE:Ljava/lang/String; = "imageUrl and/or imageUri cannot be null! Did you call setImageUrl(String) or setImageUri(Uri)?"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 14
    const-string v0, "imageUrl and/or imageUri cannot be null! Did you call setImageUrl(String) or setImageUri(Uri)?"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 15
    return-void
.end method
