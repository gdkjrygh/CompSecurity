.class public Lcom/facebook/orca/photos/b/j;
.super Ljava/lang/Exception;
.source "PhotoUploadFailedException.java"


# static fields
.field public static final a:Lcom/facebook/orca/photos/b/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    new-instance v0, Lcom/facebook/orca/photos/b/j;

    invoke-direct {v0}, Lcom/facebook/orca/photos/b/j;-><init>()V

    sput-object v0, Lcom/facebook/orca/photos/b/j;->a:Lcom/facebook/orca/photos/b/j;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 19
    const-string v0, "Message send failed due to photo upload failure. One or more photos didn\'t upload."

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 20
    return-void
.end method
