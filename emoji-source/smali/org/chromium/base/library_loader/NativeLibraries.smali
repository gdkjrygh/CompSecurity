.class public Lorg/chromium/base/library_loader/NativeLibraries;
.super Ljava/lang/Object;
.source "NativeLibraries.java"


# static fields
.field public static ENABLE_LINKER_TESTS:Z

.field public static final LIBRARIES:[Ljava/lang/String;

.field public static USE_LIBRARY_IN_ZIP_FILE:Z

.field public static USE_LINKER:Z

.field static VERSION_NUMBER:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 8
    sput-boolean v2, Lorg/chromium/base/library_loader/NativeLibraries;->USE_LINKER:Z

    .line 9
    sput-boolean v2, Lorg/chromium/base/library_loader/NativeLibraries;->USE_LIBRARY_IN_ZIP_FILE:Z

    .line 10
    sput-boolean v2, Lorg/chromium/base/library_loader/NativeLibraries;->ENABLE_LINKER_TESTS:Z

    .line 11
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "xwalkcore"

    aput-object v1, v0, v2

    sput-object v0, Lorg/chromium/base/library_loader/NativeLibraries;->LIBRARIES:[Ljava/lang/String;

    .line 13
    const-string v0, ""

    sput-object v0, Lorg/chromium/base/library_loader/NativeLibraries;->VERSION_NUMBER:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
