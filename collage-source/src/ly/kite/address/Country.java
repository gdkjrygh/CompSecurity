// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.address;

import java.util.HashMap;
import java.util.Locale;

public final class Country extends Enum
{

    private static final Country $VALUES[];
    public static final Country AFGHANISTAN;
    public static final Country ALAND_ISLANDS;
    public static final Country ALBANIA;
    public static final Country ALGERIA;
    public static final Country AMERICAN_SAMOA;
    public static final Country ANDORRA;
    public static final Country ANGOLA;
    public static final Country ANGUILLA;
    public static final Country ANTIGUA_AND_BARBUDA;
    public static final Country ARGENTINA;
    public static final Country ARMENIA;
    public static final Country ARUBA;
    public static final Country AUSTRALIA;
    public static final Country AUSTRIA;
    public static final Country AZERBAIJAN;
    public static final Country BAHAMAS;
    public static final Country BAHRAIN;
    public static final Country BANGLADESH;
    public static final Country BARBADOS;
    public static final Country BELARUS;
    public static final Country BELGIUM;
    public static final Country BELIZE;
    public static final Country BENIN;
    public static final Country BERMUDA;
    public static final Country BHUTAN;
    public static final Country BOLIVIA;
    public static final Country BONAIRE;
    public static final Country BOSNIA_AND_HERZEGOVINA;
    public static final Country BOTSWANA;
    public static final Country BOUVET_ISLAND;
    public static final Country BRAZIL;
    public static final Country BRITISH_INDIAN_OCEAN_TERRITORY;
    public static final Country BRITISH_VIRGIN_ISLANDS;
    public static final Country BRUNEI_DARUSSALAM;
    public static final Country BULGARIA;
    public static final Country BURKINA_FASO;
    public static final Country BURUNDI;
    public static final Country CAMBODIA;
    public static final Country CAMEROON;
    public static final Country CANADA;
    public static final Country CAPE_VERDE;
    public static final Country CAYMAN_ISLANDS;
    public static final Country CENTRAL_AFRICAN_REPUBLIC;
    public static final Country CHAD;
    public static final Country CHILE;
    public static final Country CHINA;
    public static final Country CHRISTMAS_ISLANDS;
    public static final Country COCOS_ISLANDS;
    public static final Country COLOMBIA;
    public static final Country COMOROS;
    public static final Country CONGO;
    public static final Country COOK_ISLANDS;
    public static final Country COSTA_RICA;
    public static final Country CROATIA;
    public static final Country CUBA;
    public static final Country CURACAO;
    public static final Country CYPRUS;
    public static final Country CZECH_REPUBLIC;
    public static final Country DEMOCRATIC_REPUBLIC_OF_CONGO;
    public static final Country DENMARK;
    public static final Country DJIBOUTI;
    public static final Country DOMINICA;
    public static final Country DOMINICAN_REPUBLIC;
    public static final Country ECUADOR;
    public static final Country EGYPT;
    public static final Country EL_SALVADOR;
    public static final Country EQUATORIAL_GUINEA;
    public static final Country ERITREA;
    public static final Country ESTONIA;
    public static final Country ETHIOPIA;
    public static final Country FALKLAND_ISLANDS;
    public static final Country FAROE_ISLANDS;
    public static final Country FIJI;
    public static final Country FINLAND;
    public static final Country FRANCE;
    public static final Country FRENCH_GUIANA;
    public static final Country FRENCH_POLYNESIA;
    public static final Country FRENCH_SOUTHERN_TERRITORIES;
    public static final Country FYR_MACEDONIA;
    public static final Country GABON;
    public static final Country GAMBIA;
    public static final Country GEORGIA;
    public static final Country GERMANY;
    public static final Country GHANA;
    public static final Country GIBRALTAR;
    public static final Country GREECE;
    public static final Country GREENLAND;
    public static final Country GRENEDA;
    public static final Country GUADELOUPE;
    public static final Country GUAM;
    public static final Country GUATEMALA;
    public static final Country GUERNSEY;
    public static final Country GUINEA;
    public static final Country GUINEA_BISSAU;
    public static final Country GUYANA;
    public static final Country HAITI;
    public static final Country HEARD_ISLAND_AND_MCDONALD_ISLANDS;
    public static final Country HOLY_SEE;
    public static final Country HONDURAS;
    public static final Country HONG_KONG;
    public static final Country HUNGARY;
    public static final Country ICELAND;
    public static final Country INDIA;
    public static final Country INDONESIA;
    public static final Country IRAN;
    public static final Country IRAQ;
    public static final Country IRELAND;
    public static final Country ISLE_OF_MAN;
    public static final Country ISRAEL;
    public static final Country ITALY;
    public static final Country IVORY_COAST;
    public static final Country JAMAICA;
    public static final Country JAPAN;
    public static final Country JERSEY;
    public static final Country JORDAN;
    public static final Country KAZAKHSTAN;
    public static final Country KENYA;
    public static final Country KIRIBATI;
    public static final Country KUWAIT;
    public static final Country KYRGYZSTAN;
    public static final Country LAO;
    public static final Country LATVIA;
    public static final Country LEBANON;
    public static final Country LESOTHO;
    public static final Country LIBERIA;
    public static final Country LIBYA;
    public static final Country LIECHTENSTEIN;
    public static final Country LITHUANIA;
    private static final String LOG_TAG = "Country";
    public static final Country LUXEMBOURG;
    public static final Country MACAO;
    public static final Country MADAGASCAR;
    public static final Country MALAWI;
    public static final Country MALAYSIA;
    public static final Country MALDIVES;
    public static final Country MALI;
    public static final Country MALTA;
    public static final Country MARSHALL_ISLANDS;
    public static final Country MARTINIQUE;
    public static final Country MAURITANIA;
    public static final Country MAURITIUS;
    public static final Country MAYOTTE;
    public static final Country MEXICO;
    public static final Country MICRONESIA;
    public static final Country MOLDOVA;
    public static final Country MONACO;
    public static final Country MONGOLIA;
    public static final Country MONTENEGRO;
    public static final Country MONTSERRAT;
    public static final Country MOROCCO;
    public static final Country MOZAMBIQUE;
    public static final Country MYANMAR;
    public static final Country NAMIBIA;
    public static final Country NAURU;
    public static final Country NEPAL;
    public static final Country NETHERLANDS;
    public static final Country NEW_CALEDONIA;
    public static final Country NEW_ZEALAND;
    public static final Country NICARAGUA;
    public static final Country NIGER;
    public static final Country NIGERIA;
    public static final Country NIUE;
    public static final Country NORFOLK_ISLAND;
    public static final Country NORTHERN_MARIANA_ISLANDS;
    public static final Country NORTH_KOREA;
    public static final Country NORWAY;
    public static final Country OMAN;
    public static final Country PAKISTAN;
    public static final Country PALAU;
    public static final Country PANAMA;
    public static final Country PAPUA_NEW_GUINEA;
    public static final Country PARAGUAY;
    public static final Country PERU;
    public static final Country PHILIPPINES;
    public static final Country PITCAIRN;
    public static final Country POLAND;
    public static final Country PORTUGAL;
    public static final Country PUERTO_RICO;
    public static final Country QATAR;
    public static final Country REUNION;
    public static final Country ROMANIA;
    public static final Country RUSSIA;
    public static final Country RWANDA;
    public static final Country SAINT_BARTS;
    public static final Country SAINT_HELENA;
    public static final Country SAINT_KITTS_AND_NEVIS;
    public static final Country SAINT_LUCIA;
    public static final Country SAINT_MARTIN;
    public static final Country SAINT_PIERRE_AND_MIQUELON;
    public static final Country SAINT_VINCENT_AND_GRENADINES;
    public static final Country SAMOA;
    public static final Country SAN_MARINO;
    public static final Country SAO_TOME_AND_PRINCIPE;
    public static final Country SAUDI_ARABIA;
    public static final Country SENEGAL;
    public static final Country SERBIA;
    public static final Country SEYCHELLES;
    public static final Country SIERRA_LEONE;
    public static final Country SINGAPORE;
    public static final Country SINT_MAARTEN;
    public static final Country SLOVAKIA;
    public static final Country SLOVENIA;
    public static final Country SOLOMON_ISLANDS;
    public static final Country SOMALIA;
    public static final Country SOUTH_AFRICA;
    public static final Country SOUTH_KOREA;
    public static final Country SOUTH_SUDAN;
    public static final Country SPAIN;
    public static final Country SRI_LANKA;
    public static final Country SUDAN;
    public static final Country SURINAME;
    public static final Country SVALBARD_AND_JAN_MAYEN;
    public static final Country SWAZILAND;
    public static final Country SWEDEN;
    public static final Country SWITZERLAND;
    public static final Country SYRIA;
    public static final Country TAIWAN;
    public static final Country TAJIKISTAN;
    public static final Country TANZANIA;
    public static final Country THAILAND;
    public static final Country TIMOR_LESTE;
    public static final Country TOGO;
    public static final Country TOKELAU;
    public static final Country TONGA;
    public static final Country TRINIDAD_AND_TOBAGO;
    public static final Country TUNISIA;
    public static final Country TURKEY;
    public static final Country TURKMENISTAN;
    public static final Country TURKS_AND_CAICOS_ISLANDS;
    public static final Country TUVALU;
    public static final Country UAE;
    public static final Country UGANDA;
    public static final Country UK;
    public static final Country UKRAINE;
    public static final Country URUGUAY;
    public static final Country USA;
    public static final Country USA_MINOR_OUTLYING_ISLANDS;
    public static final Country US_VIRGIN_ISLANDS;
    public static final Country UZBEKISTAN;
    public static final Country VANUATU;
    public static final Country VENEZUELA;
    public static final Country VIET_NAM;
    public static final Country WALLIS_AND_FUTUNA;
    public static final Country WESTERN_SAHARA;
    public static final Country YEMEN;
    public static final Country ZAMBIA;
    public static final Country ZIMBABWE;
    private static HashMap sCodeCountryTable;
    private String mDisplayName;
    private String mISO2Code;
    private String mISO3Code;
    private String mISO3CurrencyCode;
    private boolean mIsInEurope;

    private Country(String s, int i, String s1, String s2, String s3, String s4, boolean flag)
    {
        super(s, i);
        mDisplayName = s1;
        mISO2Code = s2;
        mISO3Code = s3;
        mISO3CurrencyCode = s4;
        mIsInEurope = flag;
    }

    public static boolean existsForISOCode(String s)
    {
        return sCodeCountryTable.containsKey(s);
    }

    public static Country getInstance()
    {
        return getInstance(Locale.getDefault());
    }

    public static Country getInstance(String s)
    {
        return (Country)sCodeCountryTable.get(s);
    }

    public static Country getInstance(Locale locale)
    {
        if (locale == null)
        {
            throw new IllegalArgumentException("Please provide a non null locale");
        } else
        {
            return getInstance(locale.getISO3Country());
        }
    }

    public static Country valueOf(String s)
    {
        return (Country)Enum.valueOf(ly/kite/address/Country, s);
    }

    public static Country[] values()
    {
        return (Country[])$VALUES.clone();
    }

    public String displayName()
    {
        return mDisplayName;
    }

    public boolean isInEurope()
    {
        return mIsInEurope;
    }

    public String iso2Code()
    {
        return mISO2Code;
    }

    public String iso3Code()
    {
        return mISO3Code;
    }

    public String iso3CurrencyCode()
    {
        return mISO3CurrencyCode;
    }

    public String toString()
    {
        return mDisplayName;
    }

    public boolean usesISOCode(String s)
    {
        return mISO2Code.equals(s) || mISO3Code.equals(s);
    }

    static 
    {
        ALAND_ISLANDS = new Country("ALAND_ISLANDS", 0, "\305land Islands", "AX", "ALA", "EUR", true);
        AFGHANISTAN = new Country("AFGHANISTAN", 1, "Afghanistan", "AF", "AFG", "AFN", false);
        ALBANIA = new Country("ALBANIA", 2, "Albania", "AL", "ALB", "ALL", true);
        ALGERIA = new Country("ALGERIA", 3, "Algeria", "DZ", "DZA", "DZD", false);
        AMERICAN_SAMOA = new Country("AMERICAN_SAMOA", 4, "American Samoa", "AS", "ASM", "USD", false);
        ANDORRA = new Country("ANDORRA", 5, "Andorra", "AD", "AND", "EUR", true);
        ANGOLA = new Country("ANGOLA", 6, "Angola", "AO", "AGO", "AOA", false);
        ANGUILLA = new Country("ANGUILLA", 7, "Anguilla", "AI", "AIA", "XCD", false);
        ANTIGUA_AND_BARBUDA = new Country("ANTIGUA_AND_BARBUDA", 8, "Antigua and Barbuda", "AG", "ATG", "XCD", false);
        ARGENTINA = new Country("ARGENTINA", 9, "Argentina", "AR", "ARG", "ARS", false);
        ARMENIA = new Country("ARMENIA", 10, "Armenia", "AM", "ARM", "AMD", false);
        ARUBA = new Country("ARUBA", 11, "Aruba", "AW", "ABW", "AWG", false);
        AUSTRALIA = new Country("AUSTRALIA", 12, "Australia", "AU", "AUS", "AUD", false);
        AUSTRIA = new Country("AUSTRIA", 13, "Austria", "AT", "AUT", "EUR", true);
        AZERBAIJAN = new Country("AZERBAIJAN", 14, "Azerbaijan", "AZ", "AZE", "AZN", false);
        BAHAMAS = new Country("BAHAMAS", 15, "Bahamas", "BS", "BHS", "BSD", false);
        BAHRAIN = new Country("BAHRAIN", 16, "Bahrain", "BH", "BHR", "BHD", false);
        BANGLADESH = new Country("BANGLADESH", 17, "Bangladesh", "BD", "BGD", "BDT", false);
        BARBADOS = new Country("BARBADOS", 18, "Barbados", "BB", "BRB", "BBD", false);
        BELARUS = new Country("BELARUS", 19, "Belarus", "BY", "BLR", "BYR", true);
        BELGIUM = new Country("BELGIUM", 20, "Belgium", "BE", "BEL", "EUR", true);
        BELIZE = new Country("BELIZE", 21, "Belize", "BZ", "BLZ", "BZD", false);
        BENIN = new Country("BENIN", 22, "Benin", "BJ", "BEN", "XOF", false);
        BERMUDA = new Country("BERMUDA", 23, "Bermuda", "BM", "BMU", "BMD", false);
        BHUTAN = new Country("BHUTAN", 24, "Bhutan", "BT", "BTN", "INR", false);
        BOLIVIA = new Country("BOLIVIA", 25, "Bolivia, Plurinational State of", "BO", "BOL", "BOB", false);
        BONAIRE = new Country("BONAIRE", 26, "Bonaire, Sint Eustatius and Saba", "BQ", "BES", "USD", false);
        BOSNIA_AND_HERZEGOVINA = new Country("BOSNIA_AND_HERZEGOVINA", 27, "Bosnia and Herzegovina", "BA", "BIH", "BAM", true);
        BOTSWANA = new Country("BOTSWANA", 28, "Botswana", "BW", "BWA", "BWP", false);
        BOUVET_ISLAND = new Country("BOUVET_ISLAND", 29, "Bouvet Island", "BV", "BVT", "NOK", false);
        BRAZIL = new Country("BRAZIL", 30, "Brazil", "BR", "BRA", "BRL", false);
        BRITISH_INDIAN_OCEAN_TERRITORY = new Country("BRITISH_INDIAN_OCEAN_TERRITORY", 31, "British Indian Ocean Territory", "IO", "IOT", "USD", false);
        BRUNEI_DARUSSALAM = new Country("BRUNEI_DARUSSALAM", 32, "Brunei Darussalam", "BN", "BRN", "BND", false);
        BULGARIA = new Country("BULGARIA", 33, "Bulgaria", "BG", "BGR", "BGN", true);
        BURKINA_FASO = new Country("BURKINA_FASO", 34, "Burkina Faso", "BF", "BFA", "XOF", false);
        BURUNDI = new Country("BURUNDI", 35, "Burundi", "BI", "BDI", "BIF", false);
        CAMBODIA = new Country("CAMBODIA", 36, "Cambodia", "KH", "KHM", "KHR", false);
        CAMEROON = new Country("CAMEROON", 37, "Cameroon", "CM", "CMR", "XAF", false);
        CANADA = new Country("CANADA", 38, "Canada", "CA", "CAN", "CAD", false);
        CAPE_VERDE = new Country("CAPE_VERDE", 39, "Cape Verde", "CV", "CPV", "CVE", false);
        CAYMAN_ISLANDS = new Country("CAYMAN_ISLANDS", 40, "Cayman Islands", "KY", "CYM", "KYD", false);
        CENTRAL_AFRICAN_REPUBLIC = new Country("CENTRAL_AFRICAN_REPUBLIC", 41, "Central African Republic", "CF", "CAF", "XAF", false);
        CHAD = new Country("CHAD", 42, "Chad", "TD", "TCD", "XAF", false);
        CHILE = new Country("CHILE", 43, "Chile", "CL", "CHL", "CLP", false);
        CHINA = new Country("CHINA", 44, "China", "CN", "CHN", "CNY", false);
        CHRISTMAS_ISLANDS = new Country("CHRISTMAS_ISLANDS", 45, "Christmas Island", "CX", "CXR", "AUD", false);
        COCOS_ISLANDS = new Country("COCOS_ISLANDS", 46, "Cocos (Keeling) Islands", "CC", "CCK", "AUD", false);
        COLOMBIA = new Country("COLOMBIA", 47, "Colombia", "CO", "COL", "COP", false);
        COMOROS = new Country("COMOROS", 48, "Comoros", "KM", "COM", "KMF", false);
        CONGO = new Country("CONGO", 49, "Congo", "CG", "COG", "XAF", false);
        DEMOCRATIC_REPUBLIC_OF_CONGO = new Country("DEMOCRATIC_REPUBLIC_OF_CONGO", 50, "Congo, the Democratic Republic of the", "CD", "COD", "CDF", false);
        COOK_ISLANDS = new Country("COOK_ISLANDS", 51, "Cook Islands", "CK", "COK", "NZD", false);
        COSTA_RICA = new Country("COSTA_RICA", 52, "Costa Rica", "CR", "CRI", "CRC", false);
        CROATIA = new Country("CROATIA", 53, "Croatia", "HR", "HRV", "HRK", true);
        CUBA = new Country("CUBA", 54, "Cuba", "CU", "CUB", "CUP", false);
        CURACAO = new Country("CURACAO", 55, "Cura\347ao", "CW", "CUW", "ANG", false);
        CYPRUS = new Country("CYPRUS", 56, "Cyprus", "CY", "CYP", "EUR", false);
        CZECH_REPUBLIC = new Country("CZECH_REPUBLIC", 57, "Czech Republic", "CZ", "CZE", "CZK", true);
        IVORY_COAST = new Country("IVORY_COAST", 58, "C\364te d'Ivoire", "CI", "CIV", "XOF", false);
        DENMARK = new Country("DENMARK", 59, "Denmark", "DK", "DNK", "DKK", true);
        DJIBOUTI = new Country("DJIBOUTI", 60, "Djibouti", "DJ", "DJI", "DJF", false);
        DOMINICA = new Country("DOMINICA", 61, "Dominica", "DM", "DMA", "XCD", false);
        DOMINICAN_REPUBLIC = new Country("DOMINICAN_REPUBLIC", 62, "Dominican Republic", "DO", "DOM", "DOP", false);
        ECUADOR = new Country("ECUADOR", 63, "Ecuador", "EC", "ECU", "USD", false);
        EGYPT = new Country("EGYPT", 64, "Egypt", "EG", "EGY", "EGP", false);
        EL_SALVADOR = new Country("EL_SALVADOR", 65, "El Salvador", "SV", "SLV", "USD", false);
        EQUATORIAL_GUINEA = new Country("EQUATORIAL_GUINEA", 66, "Equatorial Guinea", "GQ", "GNQ", "XAF", false);
        ERITREA = new Country("ERITREA", 67, "Eritrea", "ER", "ERI", "ERN", false);
        ESTONIA = new Country("ESTONIA", 68, "Estonia", "EE", "EST", "EUR", true);
        ETHIOPIA = new Country("ETHIOPIA", 69, "Ethiopia", "ET", "ETH", "ETB", false);
        FALKLAND_ISLANDS = new Country("FALKLAND_ISLANDS", 70, "Falkland Islands (Malvinas)", "FK", "FLK", "FKP", false);
        FAROE_ISLANDS = new Country("FAROE_ISLANDS", 71, "Faroe Islands", "FO", "FRO", "DKK", true);
        FIJI = new Country("FIJI", 72, "Fiji", "FJ", "FJI", "FJD", false);
        FINLAND = new Country("FINLAND", 73, "Finland", "FI", "FIN", "EUR", true);
        FRANCE = new Country("FRANCE", 74, "France", "FR", "FRA", "EUR", true);
        FRENCH_GUIANA = new Country("FRENCH_GUIANA", 75, "French Guiana", "GF", "GUF", "EUR", false);
        FRENCH_POLYNESIA = new Country("FRENCH_POLYNESIA", 76, "French Polynesia", "PF", "PYF", "XPF", false);
        FRENCH_SOUTHERN_TERRITORIES = new Country("FRENCH_SOUTHERN_TERRITORIES", 77, "French Southern Territories", "TF", "ATF", "EUR", false);
        GABON = new Country("GABON", 78, "Gabon", "GA", "GAB", "XAF", false);
        GAMBIA = new Country("GAMBIA", 79, "Gambia", "GM", "GMB", "GMD", false);
        GEORGIA = new Country("GEORGIA", 80, "Georgia", "GE", "GEO", "GEL", false);
        GERMANY = new Country("GERMANY", 81, "Germany", "DE", "DEU", "EUR", true);
        GHANA = new Country("GHANA", 82, "Ghana", "GH", "GHA", "GHS", false);
        GIBRALTAR = new Country("GIBRALTAR", 83, "Gibraltar", "GI", "GIB", "GIP", true);
        GREECE = new Country("GREECE", 84, "Greece", "GR", "GRC", "EUR", true);
        GREENLAND = new Country("GREENLAND", 85, "Greenland", "GL", "GRL", "DKK", false);
        GRENEDA = new Country("GRENEDA", 86, "Grenada", "GD", "GRD", "XCD", false);
        GUADELOUPE = new Country("GUADELOUPE", 87, "Guadeloupe", "GP", "GLP", "EUR", false);
        GUAM = new Country("GUAM", 88, "Guam", "GU", "GUM", "USD", false);
        GUATEMALA = new Country("GUATEMALA", 89, "Guatemala", "GT", "GTM", "GTQ", false);
        GUERNSEY = new Country("GUERNSEY", 90, "Guernsey", "GG", "GGY", "GBP", true);
        GUINEA = new Country("GUINEA", 91, "Guinea", "GN", "GIN", "GNF", false);
        GUINEA_BISSAU = new Country("GUINEA_BISSAU", 92, "Guinea-Bissau", "GW", "GNB", "XOF", false);
        GUYANA = new Country("GUYANA", 93, "Guyana", "GY", "GUY", "GYD", false);
        HAITI = new Country("HAITI", 94, "Haiti", "HT", "HTI", "USD", false);
        HEARD_ISLAND_AND_MCDONALD_ISLANDS = new Country("HEARD_ISLAND_AND_MCDONALD_ISLANDS", 95, "Heard Island and Mcdonald Islands", "HM", "HMD", "AUD", false);
        HOLY_SEE = new Country("HOLY_SEE", 96, "Holy See (Vatican City State)", "VA", "VAT", "EUR", true);
        HONDURAS = new Country("HONDURAS", 97, "Honduras", "HN", "HND", "HNL", false);
        HONG_KONG = new Country("HONG_KONG", 98, "Hong Kong", "HK", "HKG", "HKD", false);
        HUNGARY = new Country("HUNGARY", 99, "Hungary", "HU", "HUN", "HUF", true);
        ICELAND = new Country("ICELAND", 100, "Iceland", "IS", "ISL", "ISK", true);
        INDIA = new Country("INDIA", 101, "India", "IN", "IND", "INR", false);
        INDONESIA = new Country("INDONESIA", 102, "Indonesia", "ID", "IDN", "IDR", false);
        IRAN = new Country("IRAN", 103, "Iran, Islamic Republic of", "IR", "IRN", "IRR", false);
        IRAQ = new Country("IRAQ", 104, "Iraq", "IQ", "IRQ", "IQD", false);
        IRELAND = new Country("IRELAND", 105, "Ireland", "IE", "IRL", "EUR", true);
        ISLE_OF_MAN = new Country("ISLE_OF_MAN", 106, "Isle of Man", "IM", "IMN", "GBP", true);
        ISRAEL = new Country("ISRAEL", 107, "Israel", "IL", "ISR", "ILS", false);
        ITALY = new Country("ITALY", 108, "Italy", "IT", "ITA", "EUR", true);
        JAMAICA = new Country("JAMAICA", 109, "Jamaica", "JM", "JAM", "JMD", false);
        JAPAN = new Country("JAPAN", 110, "Japan", "JP", "JPN", "JPY", false);
        JERSEY = new Country("JERSEY", 111, "Jersey", "JE", "JEY", "GBP", true);
        JORDAN = new Country("JORDAN", 112, "Jordan", "JO", "JOR", "JOD", false);
        KAZAKHSTAN = new Country("KAZAKHSTAN", 113, "Kazakhstan", "KZ", "KAZ", "KZT", false);
        KENYA = new Country("KENYA", 114, "Kenya", "KE", "KEN", "KES", false);
        KIRIBATI = new Country("KIRIBATI", 115, "Kiribati", "KI", "KIR", "AUD", false);
        NORTH_KOREA = new Country("NORTH_KOREA", 116, "Korea, Democratic People's Republic of", "KP", "PRK", "KPW", false);
        SOUTH_KOREA = new Country("SOUTH_KOREA", 117, "Korea, Republic of", "KR", "KOR", "KRW", false);
        KUWAIT = new Country("KUWAIT", 118, "Kuwait", "KW", "KWT", "KWD", false);
        KYRGYZSTAN = new Country("KYRGYZSTAN", 119, "Kyrgyzstan", "KG", "KGZ", "KGS", false);
        LAO = new Country("LAO", 120, "Lao People's Democratic Republic", "LA", "LAO", "LAK", false);
        LATVIA = new Country("LATVIA", 121, "Latvia", "LV", "LVA", "LVL", true);
        LEBANON = new Country("LEBANON", 122, "Lebanon", "LB", "LBN", "LBP", false);
        LESOTHO = new Country("LESOTHO", 123, "Lesotho", "LS", "LSO", "ZAR", false);
        LIBERIA = new Country("LIBERIA", 124, "Liberia", "LR", "LBR", "LRD", false);
        LIBYA = new Country("LIBYA", 125, "Libya", "LY", "LBY", "LYD", false);
        LIECHTENSTEIN = new Country("LIECHTENSTEIN", 126, "Liechtenstein", "LI", "LIE", "CHF", true);
        LITHUANIA = new Country("LITHUANIA", 127, "Lithuania", "LT", "LTU", "LTL", true);
        LUXEMBOURG = new Country("LUXEMBOURG", 128, "Luxembourg", "LU", "LUX", "EUR", true);
        MACAO = new Country("MACAO", 129, "Macao", "MO", "MAC", "MOP", false);
        FYR_MACEDONIA = new Country("FYR_MACEDONIA", 130, "Macedonia, the Former Yugoslav Republic of", "MK", "MKD", "MKD", true);
        MADAGASCAR = new Country("MADAGASCAR", 131, "Madagascar", "MG", "MDG", "MGA", false);
        MALAWI = new Country("MALAWI", 132, "Malawi", "MW", "MWI", "MWK", false);
        MALAYSIA = new Country("MALAYSIA", 133, "Malaysia", "MY", "MYS", "MYR", false);
        MALDIVES = new Country("MALDIVES", 134, "Maldives", "MV", "MDV", "MVR", false);
        MALI = new Country("MALI", 135, "Mali", "ML", "MLI", "XOF", false);
        MALTA = new Country("MALTA", 136, "Malta", "MT", "MLT", "EUR", true);
        MARSHALL_ISLANDS = new Country("MARSHALL_ISLANDS", 137, "Marshall Islands", "MH", "MHL", "USD", false);
        MARTINIQUE = new Country("MARTINIQUE", 138, "Martinique", "MQ", "MTQ", "EUR", false);
        MAURITANIA = new Country("MAURITANIA", 139, "Mauritania", "MR", "MRT", "MRO", false);
        MAURITIUS = new Country("MAURITIUS", 140, "Mauritius", "MU", "MUS", "MUR", false);
        MAYOTTE = new Country("MAYOTTE", 141, "Mayotte", "YT", "MYT", "EUR", false);
        MEXICO = new Country("MEXICO", 142, "Mexico", "MX", "MEX", "MXN", false);
        MICRONESIA = new Country("MICRONESIA", 143, "Micronesia, Federated States of", "FM", "FSM", "USD", false);
        MOLDOVA = new Country("MOLDOVA", 144, "Moldova, Republic of", "MD", "MDA", "MDL", true);
        MONACO = new Country("MONACO", 145, "Monaco", "MC", "MCO", "EUR", true);
        MONGOLIA = new Country("MONGOLIA", 146, "Mongolia", "MN", "MNG", "MNT", false);
        MONTENEGRO = new Country("MONTENEGRO", 147, "Montenegro", "ME", "MNE", "EUR", true);
        MONTSERRAT = new Country("MONTSERRAT", 148, "Montserrat", "MS", "MSR", "XCD", false);
        MOROCCO = new Country("MOROCCO", 149, "Morocco", "MA", "MAR", "MAD", false);
        MOZAMBIQUE = new Country("MOZAMBIQUE", 150, "Mozambique", "MZ", "MOZ", "MZN", false);
        MYANMAR = new Country("MYANMAR", 151, "Myanmar", "MM", "MMR", "MMK", false);
        NAMIBIA = new Country("NAMIBIA", 152, "Namibia", "NA", "NAM", "ZAR", false);
        NAURU = new Country("NAURU", 153, "Nauru", "NR", "NRU", "AUD", false);
        NEPAL = new Country("NEPAL", 154, "Nepal", "NP", "NPL", "NPR", false);
        NETHERLANDS = new Country("NETHERLANDS", 155, "Netherlands", "NL", "NLD", "EUR", true);
        NEW_CALEDONIA = new Country("NEW_CALEDONIA", 156, "New Caledonia", "NC", "NCL", "XPF", false);
        NEW_ZEALAND = new Country("NEW_ZEALAND", 157, "New Zealand", "NZ", "NZL", "NZD", false);
        NICARAGUA = new Country("NICARAGUA", 158, "Nicaragua", "NI", "NIC", "NIO", false);
        NIGER = new Country("NIGER", 159, "Niger", "NE", "NER", "XOF", false);
        NIGERIA = new Country("NIGERIA", 160, "Nigeria", "NG", "NGA", "NGN", false);
        NIUE = new Country("NIUE", 161, "Niue", "NU", "NIU", "NZD", false);
        NORFOLK_ISLAND = new Country("NORFOLK_ISLAND", 162, "Norfolk Island", "NF", "NFK", "AUD", false);
        NORTHERN_MARIANA_ISLANDS = new Country("NORTHERN_MARIANA_ISLANDS", 163, "Northern Mariana Islands", "MP", "MNP", "USD", false);
        NORWAY = new Country("NORWAY", 164, "Norway", "NO", "NOR", "NOK", true);
        OMAN = new Country("OMAN", 165, "Oman", "OM", "OMN", "OMR", false);
        PAKISTAN = new Country("PAKISTAN", 166, "Pakistan", "PK", "PAK", "PKR", false);
        PALAU = new Country("PALAU", 167, "Palau", "PW", "PLW", "USD", false);
        PANAMA = new Country("PANAMA", 168, "Panama", "PA", "PAN", "USD", false);
        PAPUA_NEW_GUINEA = new Country("PAPUA_NEW_GUINEA", 169, "Papua New Guinea", "PG", "PNG", "PGK", false);
        PARAGUAY = new Country("PARAGUAY", 170, "Paraguay", "PY", "PRY", "PYG", false);
        PERU = new Country("PERU", 171, "Peru", "PE", "PER", "PEN", false);
        PHILIPPINES = new Country("PHILIPPINES", 172, "Philippines", "PH", "PHL", "PHP", false);
        PITCAIRN = new Country("PITCAIRN", 173, "Pitcairn", "PN", "PCN", "NZD", false);
        POLAND = new Country("POLAND", 174, "Poland", "PL", "POL", "PLN", true);
        PORTUGAL = new Country("PORTUGAL", 175, "Portugal", "PT", "PRT", "EUR", true);
        PUERTO_RICO = new Country("PUERTO_RICO", 176, "Puerto Rico", "PR", "PRI", "USD", false);
        QATAR = new Country("QATAR", 177, "Qatar", "QA", "QAT", "QAR", false);
        ROMANIA = new Country("ROMANIA", 178, "Romania", "RO", "ROU", "RON", true);
        RUSSIA = new Country("RUSSIA", 179, "Russian Federation", "RU", "RUS", "RUB", true);
        RWANDA = new Country("RWANDA", 180, "Rwanda", "RW", "RWA", "RWF", false);
        REUNION = new Country("REUNION", 181, "R\351union", "RE", "REU", "EUR", false);
        SAINT_BARTS = new Country("SAINT_BARTS", 182, "Saint Barth\351lemy", "BL", "BLM", "EUR", false);
        SAINT_HELENA = new Country("SAINT_HELENA", 183, "Saint Helena, Ascension and Tristan da Cunha", "SH", "SHN", "SHP", false);
        SAINT_KITTS_AND_NEVIS = new Country("SAINT_KITTS_AND_NEVIS", 184, "Saint Kitts and Nevis", "KN", "KNA", "XCD", false);
        SAINT_LUCIA = new Country("SAINT_LUCIA", 185, "Saint Lucia", "LC", "LCA", "XCD", false);
        SAINT_MARTIN = new Country("SAINT_MARTIN", 186, "Saint Martin (French part)", "MF", "MAF", "EUR", false);
        SAINT_PIERRE_AND_MIQUELON = new Country("SAINT_PIERRE_AND_MIQUELON", 187, "Saint Pierre and Miquelon", "PM", "SPM", "EUR", false);
        SAINT_VINCENT_AND_GRENADINES = new Country("SAINT_VINCENT_AND_GRENADINES", 188, "Saint Vincent and the Grenadines", "VC", "VCT", "XCD", false);
        SAMOA = new Country("SAMOA", 189, "Samoa", "WS", "WSM", "WST", false);
        SAN_MARINO = new Country("SAN_MARINO", 190, "San Marino", "SM", "SMR", "EUR", true);
        SAO_TOME_AND_PRINCIPE = new Country("SAO_TOME_AND_PRINCIPE", 191, "Sao Tome and Principe", "ST", "STP", "STD", false);
        SAUDI_ARABIA = new Country("SAUDI_ARABIA", 192, "Saudi Arabia", "SA", "SAU", "SAR", false);
        SENEGAL = new Country("SENEGAL", 193, "Senegal", "SN", "SEN", "XOF", false);
        SERBIA = new Country("SERBIA", 194, "Serbia", "RS", "SRB", "RSD", true);
        SEYCHELLES = new Country("SEYCHELLES", 195, "Seychelles", "SC", "SYC", "SCR", false);
        SIERRA_LEONE = new Country("SIERRA_LEONE", 196, "Sierra Leone", "SL", "SLE", "SLL", false);
        SINGAPORE = new Country("SINGAPORE", 197, "Singapore", "SG", "SGP", "SGD", false);
        SINT_MAARTEN = new Country("SINT_MAARTEN", 198, "Sint Maarten (Dutch part)", "SX", "SXM", "ANG", false);
        SLOVAKIA = new Country("SLOVAKIA", 199, "Slovakia", "SK", "SVK", "EUR", true);
        SLOVENIA = new Country("SLOVENIA", 200, "Slovenia", "SI", "SVN", "EUR", true);
        SOLOMON_ISLANDS = new Country("SOLOMON_ISLANDS", 201, "Solomon Islands", "SB", "SLB", "SBD", false);
        SOMALIA = new Country("SOMALIA", 202, "Somalia", "SO", "SOM", "SOS", false);
        SOUTH_AFRICA = new Country("SOUTH_AFRICA", 203, "South Africa", "ZA", "ZAF", "ZAR", false);
        SOUTH_SUDAN = new Country("SOUTH_SUDAN", 204, "South Sudan", "SS", "SSD", "SSP", false);
        SPAIN = new Country("SPAIN", 205, "Spain", "ES", "ESP", "EUR", true);
        SRI_LANKA = new Country("SRI_LANKA", 206, "Sri Lanka", "LK", "LKA", "LKR", false);
        SUDAN = new Country("SUDAN", 207, "Sudan", "SD", "SDN", "SDG", false);
        SURINAME = new Country("SURINAME", 208, "Suriname", "SR", "SUR", "SRD", false);
        SVALBARD_AND_JAN_MAYEN = new Country("SVALBARD_AND_JAN_MAYEN", 209, "Svalbard and Jan Mayen", "SJ", "SJM", "NOK", true);
        SWAZILAND = new Country("SWAZILAND", 210, "Swaziland", "SZ", "SWZ", "SZL", false);
        SWEDEN = new Country("SWEDEN", 211, "Sweden", "SE", "SWE", "SEK", true);
        SWITZERLAND = new Country("SWITZERLAND", 212, "Switzerland", "CH", "CHE", "CHF", true);
        SYRIA = new Country("SYRIA", 213, "Syrian Arab Republic", "SY", "SYR", "SYP", false);
        TAIWAN = new Country("TAIWAN", 214, "Taiwan", "TW", "TWN", "TWD", false);
        TAJIKISTAN = new Country("TAJIKISTAN", 215, "Tajikistan", "TJ", "TJK", "TJS", false);
        TANZANIA = new Country("TANZANIA", 216, "Tanzania, United Republic of", "TZ", "TZA", "TZS", false);
        THAILAND = new Country("THAILAND", 217, "Thailand", "TH", "THA", "THB", false);
        TIMOR_LESTE = new Country("TIMOR_LESTE", 218, "Timor-Leste", "TL", "TLS", "USD", false);
        TOGO = new Country("TOGO", 219, "Togo", "TG", "TGO", "XOF", false);
        TOKELAU = new Country("TOKELAU", 220, "Tokelau", "TK", "TKL", "NZD", false);
        TONGA = new Country("TONGA", 221, "Tonga", "TO", "TON", "TOP", false);
        TRINIDAD_AND_TOBAGO = new Country("TRINIDAD_AND_TOBAGO", 222, "Trinidad and Tobago", "TT", "TTO", "TTD", false);
        TUNISIA = new Country("TUNISIA", 223, "Tunisia", "TN", "TUN", "TND", false);
        TURKEY = new Country("TURKEY", 224, "Turkey", "TR", "TUR", "TRY", false);
        TURKMENISTAN = new Country("TURKMENISTAN", 225, "Turkmenistan", "TM", "TKM", "TMT", false);
        TURKS_AND_CAICOS_ISLANDS = new Country("TURKS_AND_CAICOS_ISLANDS", 226, "Turks and Caicos Islands", "TC", "TCA", "USD", false);
        TUVALU = new Country("TUVALU", 227, "Tuvalu", "TV", "TUV", "AUD", false);
        UGANDA = new Country("UGANDA", 228, "Uganda", "UG", "UGA", "UGX", false);
        UKRAINE = new Country("UKRAINE", 229, "Ukraine", "UA", "UKR", "UAH", true);
        UAE = new Country("UAE", 230, "United Arab Emirates", "AE", "ARE", "AED", false);
        UK = new Country("UK", 231, "United Kingdom", "GB", "GBR", "GBP", true);
        USA = new Country("USA", 232, "United States", "US", "USA", "USD", false);
        USA_MINOR_OUTLYING_ISLANDS = new Country("USA_MINOR_OUTLYING_ISLANDS", 233, "United States Minor Outlying Islands", "UM", "UMI", "USD", false);
        URUGUAY = new Country("URUGUAY", 234, "Uruguay", "UY", "URY", "UYU", false);
        UZBEKISTAN = new Country("UZBEKISTAN", 235, "Uzbekistan", "UZ", "UZB", "UZS", false);
        VANUATU = new Country("VANUATU", 236, "Vanuatu", "VU", "VUT", "VUV", false);
        VENEZUELA = new Country("VENEZUELA", 237, "Venezuela, Bolivarian Republic of", "VE", "VEN", "VEF", false);
        VIET_NAM = new Country("VIET_NAM", 238, "Viet Nam", "VN", "VNM", "VND", false);
        BRITISH_VIRGIN_ISLANDS = new Country("BRITISH_VIRGIN_ISLANDS", 239, "Virgin Islands, British", "VG", "VGB", "USD", false);
        US_VIRGIN_ISLANDS = new Country("US_VIRGIN_ISLANDS", 240, "Virgin Islands, U.S.", "VI", "VIR", "USD", false);
        WALLIS_AND_FUTUNA = new Country("WALLIS_AND_FUTUNA", 241, "Wallis and Futuna", "WF", "WLF", "XPF", false);
        WESTERN_SAHARA = new Country("WESTERN_SAHARA", 242, "Western Sahara", "EH", "ESH", "MAD", false);
        YEMEN = new Country("YEMEN", 243, "Yemen", "YE", "YEM", "YER", false);
        ZAMBIA = new Country("ZAMBIA", 244, "Zambia", "ZM", "ZMB", "ZMW", false);
        ZIMBABWE = new Country("ZIMBABWE", 245, "Zimbabwe", "ZW", "ZWE", "ZWL", false);
        $VALUES = (new Country[] {
            ALAND_ISLANDS, AFGHANISTAN, ALBANIA, ALGERIA, AMERICAN_SAMOA, ANDORRA, ANGOLA, ANGUILLA, ANTIGUA_AND_BARBUDA, ARGENTINA, 
            ARMENIA, ARUBA, AUSTRALIA, AUSTRIA, AZERBAIJAN, BAHAMAS, BAHRAIN, BANGLADESH, BARBADOS, BELARUS, 
            BELGIUM, BELIZE, BENIN, BERMUDA, BHUTAN, BOLIVIA, BONAIRE, BOSNIA_AND_HERZEGOVINA, BOTSWANA, BOUVET_ISLAND, 
            BRAZIL, BRITISH_INDIAN_OCEAN_TERRITORY, BRUNEI_DARUSSALAM, BULGARIA, BURKINA_FASO, BURUNDI, CAMBODIA, CAMEROON, CANADA, CAPE_VERDE, 
            CAYMAN_ISLANDS, CENTRAL_AFRICAN_REPUBLIC, CHAD, CHILE, CHINA, CHRISTMAS_ISLANDS, COCOS_ISLANDS, COLOMBIA, COMOROS, CONGO, 
            DEMOCRATIC_REPUBLIC_OF_CONGO, COOK_ISLANDS, COSTA_RICA, CROATIA, CUBA, CURACAO, CYPRUS, CZECH_REPUBLIC, IVORY_COAST, DENMARK, 
            DJIBOUTI, DOMINICA, DOMINICAN_REPUBLIC, ECUADOR, EGYPT, EL_SALVADOR, EQUATORIAL_GUINEA, ERITREA, ESTONIA, ETHIOPIA, 
            FALKLAND_ISLANDS, FAROE_ISLANDS, FIJI, FINLAND, FRANCE, FRENCH_GUIANA, FRENCH_POLYNESIA, FRENCH_SOUTHERN_TERRITORIES, GABON, GAMBIA, 
            GEORGIA, GERMANY, GHANA, GIBRALTAR, GREECE, GREENLAND, GRENEDA, GUADELOUPE, GUAM, GUATEMALA, 
            GUERNSEY, GUINEA, GUINEA_BISSAU, GUYANA, HAITI, HEARD_ISLAND_AND_MCDONALD_ISLANDS, HOLY_SEE, HONDURAS, HONG_KONG, HUNGARY, 
            ICELAND, INDIA, INDONESIA, IRAN, IRAQ, IRELAND, ISLE_OF_MAN, ISRAEL, ITALY, JAMAICA, 
            JAPAN, JERSEY, JORDAN, KAZAKHSTAN, KENYA, KIRIBATI, NORTH_KOREA, SOUTH_KOREA, KUWAIT, KYRGYZSTAN, 
            LAO, LATVIA, LEBANON, LESOTHO, LIBERIA, LIBYA, LIECHTENSTEIN, LITHUANIA, LUXEMBOURG, MACAO, 
            FYR_MACEDONIA, MADAGASCAR, MALAWI, MALAYSIA, MALDIVES, MALI, MALTA, MARSHALL_ISLANDS, MARTINIQUE, MAURITANIA, 
            MAURITIUS, MAYOTTE, MEXICO, MICRONESIA, MOLDOVA, MONACO, MONGOLIA, MONTENEGRO, MONTSERRAT, MOROCCO, 
            MOZAMBIQUE, MYANMAR, NAMIBIA, NAURU, NEPAL, NETHERLANDS, NEW_CALEDONIA, NEW_ZEALAND, NICARAGUA, NIGER, 
            NIGERIA, NIUE, NORFOLK_ISLAND, NORTHERN_MARIANA_ISLANDS, NORWAY, OMAN, PAKISTAN, PALAU, PANAMA, PAPUA_NEW_GUINEA, 
            PARAGUAY, PERU, PHILIPPINES, PITCAIRN, POLAND, PORTUGAL, PUERTO_RICO, QATAR, ROMANIA, RUSSIA, 
            RWANDA, REUNION, SAINT_BARTS, SAINT_HELENA, SAINT_KITTS_AND_NEVIS, SAINT_LUCIA, SAINT_MARTIN, SAINT_PIERRE_AND_MIQUELON, SAINT_VINCENT_AND_GRENADINES, SAMOA, 
            SAN_MARINO, SAO_TOME_AND_PRINCIPE, SAUDI_ARABIA, SENEGAL, SERBIA, SEYCHELLES, SIERRA_LEONE, SINGAPORE, SINT_MAARTEN, SLOVAKIA, 
            SLOVENIA, SOLOMON_ISLANDS, SOMALIA, SOUTH_AFRICA, SOUTH_SUDAN, SPAIN, SRI_LANKA, SUDAN, SURINAME, SVALBARD_AND_JAN_MAYEN, 
            SWAZILAND, SWEDEN, SWITZERLAND, SYRIA, TAIWAN, TAJIKISTAN, TANZANIA, THAILAND, TIMOR_LESTE, TOGO, 
            TOKELAU, TONGA, TRINIDAD_AND_TOBAGO, TUNISIA, TURKEY, TURKMENISTAN, TURKS_AND_CAICOS_ISLANDS, TUVALU, UGANDA, UKRAINE, 
            UAE, UK, USA, USA_MINOR_OUTLYING_ISLANDS, URUGUAY, UZBEKISTAN, VANUATU, VENEZUELA, VIET_NAM, BRITISH_VIRGIN_ISLANDS, 
            US_VIRGIN_ISLANDS, WALLIS_AND_FUTUNA, WESTERN_SAHARA, YEMEN, ZAMBIA, ZIMBABWE
        });
        sCodeCountryTable = new HashMap();
        Country acountry[] = values();
        int j = acountry.length;
        for (int i = 0; i < j; i++)
        {
            Country country = acountry[i];
            sCodeCountryTable.put(country.mISO2Code, country);
            sCodeCountryTable.put(country.mISO3Code, country);
        }

    }
}
